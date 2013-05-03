package clienteditor;

import javax.swing.JLabel;
import org.jdesktop.beansbinding.AbstractBindingListener;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.Binding.SyncFailure;

/**
 * Binding listener used to log synchronization events. It displays
 * (in given label) warnings for failed synchronizations.
 * 
 * @author Ashish Namdev
 */
public class LoggingBindingListener extends AbstractBindingListener {
    /** Label used to display warnings. */
    private JLabel outputLabel;

    LoggingBindingListener(JLabel outputLabel) {
        if (outputLabel == null) throw new IllegalArgumentException();
        this.outputLabel = outputLabel;
    }

    @Override
    public void syncFailed(Binding binding, SyncFailure fail) {
        String description;
        if ((fail != null) && (fail.getType() == Binding.SyncFailureType.VALIDATION_FAILED)) {
            description = fail.getValidationResult().getDescription();
        } else {
            description = "Sync failed!";
        }
        String msg = "[" + binding.getName() + "] " + description;
        System.out.println(msg);
        outputLabel.setText(msg);
    }

    @Override
    public void synced(Binding binding) {
        String bindName = binding.getName();
        String msg = "[" + bindName + "] Synced";
        System.out.println(msg);        
        outputLabel.setText("");
    }

}
