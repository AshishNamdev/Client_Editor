

package clienteditor;

import org.jdesktop.beansbinding.Converter;

/**
 * Converter between marital status code and its human-readable representation.
 *
 * @author Ashish Namdev
 */
public class MaritalStatusConverter extends Converter<Integer, String> {

    public String convertForward(Integer arg) {
        String value = null;
        switch (arg) {
            case 0: value="Single"; break;
            case 1: value="Married"; break;
            case 2: value="Separated"; break;
            case 3: value="Divorced"; break;
        }
        return value;
    }

    public Integer convertReverse(String arg) {
        int value = 0;
        if ("Single".equals(arg)) {
            value = 0;
        } else if ("Married".equals(arg)) {
            value = 1;
        } else if ("Separated".equals(arg)) {
            value = 2;
        } else if ("Divorced".equals(arg)) {
            value = 3;
        }
        return value;
    }

}
