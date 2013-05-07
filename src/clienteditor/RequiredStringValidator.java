
package clienteditor;

import org.jdesktop.beansbinding.Validator;

/**
 * Validator that ensures that given string is not empty.
 * 
 * @author Ashish Namdev
 */
public class RequiredStringValidator extends Validator<String> {

    public Validator.Result validate(String arg) {
        if ((arg == null) || (arg.length() == 0)) {
            return new Validator.Result(null, "Empty value");
        }
        return null;
    }
}
