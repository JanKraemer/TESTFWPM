package models;

/**
 * Created by Jan on 26.04.2017.
 */
public class User {

    private String eMail;
    private String firstName;
    private String kNummer;
    private String lastName;
    private String major;
    private int semester;

    public User ( ) { }

    public int getSemester() {
        return semester;
    }

    public String geteMail() {
        return eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getkNummer() {
        return kNummer;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setkNummer(String kNummer) {
        this.kNummer = kNummer;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}


