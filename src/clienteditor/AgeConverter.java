package clienteditor;

import org.jdesktop.beansbinding.Converter;

/**
 * <code>Integer</code> to <code>String</code> converter
 * that returns zero when the argument cannot be parsed.
 * 
 * @author Ashish Namdev
 */
public class AgeConverter extends Converter<Integer, String> 
{

    public String convertForward(Integer arg) 
	{
        String ret = String.valueOf(arg);
        
        return ret ;
    }

    public Integer convertReverse(String arg) 
	{
        int value;
        try 
		{
            value = (arg == null) ? 0 : Integer.parseInt(arg);
        }
		catch (NumberFormatException ex) 
		{
			value = 0;
		}
    return value;
    }
}
