
package clienteditor;

import org.jdesktop.beansbinding.Validator;

/**
 * Validator that ensures that given string is an e-mail address.
 * 
 * @author Ashish Namdev
 */
public class EmailValidator extends Validator<String> {

    public Validator.Result validate(String arg) {
        if ((arg.length() < 4) || !arg.contains("@") || !arg.contains(".")) {
            return new Result(null, "Please enter a valid email");
        }
        return null;    
    }
}
