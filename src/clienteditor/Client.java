

package clienteditor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Information about one clinet.
 * 
 * @author Ashish Namdev
 */
public class Client {
    /** First name of the client. */
    private String firstName;
    /** Surname of the client. */
    private String surname;
    /** Nickname of the client. */
    private String nickname;
    /** Age of the client. */
    private int age;
    /** Sex of the client (0 - female, 1 - male). */
    private int sex;
    /** Marital status of the client (0 - single, 1 - married, 2 - separated, 3 - divorced) */
    private int maritalStatus;
    /** E-mail of the client. */
    private String email;
    /** Home web page of the client. */
    private String web;
    /** Instant messenger of the client. */
    private String im;
    
    // <editor-fold defaultstate="collapsed" desc="PropertyChange Stuff">
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Get Methods">
    public String getFirstName() {
        return firstName;
    }
    
    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }
    
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getWeb() {
        return web;
    }

    public String getIm() {
        return im;
    }

    public int getSex() {
        return sex;
    }
    
    public int getMaritalStatus() {
        return maritalStatus;
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Set Methods">
    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }
    
    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public void setNickname(String nickname) {
        String oldNickname = this.nickname;
        this.nickname = nickname;
        changeSupport.firePropertyChange("nickname", oldNickname, nickname);
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public void setWeb(String web) {
        String oldWeb = this.web;
        this.web = web;
        changeSupport.firePropertyChange("web", oldWeb, web);
    }

    public void setIm(String im) {
        String oldIm = this.im;
        this.im = im;
        changeSupport.firePropertyChange("im", oldIm, im);
    }

    public void setSex(int sex) {
        int oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }
    
    public void setMaritalStatus(int maritalStatus) {
        int oldMaritalStatus = this.maritalStatus;
        this.maritalStatus = maritalStatus;
        changeSupport.firePropertyChange("maritalStatus", oldMaritalStatus, maritalStatus);
    }

    // </editor-fold>
    
    public static Client createTestClient() {
        Client client = new Client();
        client.setFirstName("Ashish");
        client.setSurname("Namdev");
        client.setNickname("Ankit");
        client.setAge(22);
        
        client.setEmail("ashish28.sirt@gmail.com");
        client.setWeb("https://namdevashish.blogspot.in");
        client.setIm("ICQ: 53 25 89 76");
        
        client.setSex(1);
        client.setMaritalStatus(2);

        return client;
    }
}
