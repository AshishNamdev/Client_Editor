import org.jdesktop.beansbinding.Validator;

/**
 * Validator that ensures that given value is between 1 and 199.
 * 
 * @author Ashish Namdev
 */
public class AgeValidator extends Validator<Integer> {

    public Validator.Result validate(Integer arg) {        
        if ((arg < 1) || (arg > 199)) {
            return new Result(null, "Age range is 1-199");
        }
        
        return null;    
    }
}
