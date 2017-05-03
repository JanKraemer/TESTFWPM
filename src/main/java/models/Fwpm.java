package models;

import java.util.List;

/**
 * Created by Jan on 26.04.2017.
 */
public class Fwpm {

    private int id;
    private int moduleNumber;
    private int numberOfSeats;
    private List<User> participants;
    private String responsibleTeacher;
    private String responsibleTeacherEmail;
    private String title;

    public Fwpm( ) {}

    public void setResponsibleTeacherEmail(String responsibleTeacherEmail) {
        this.responsibleTeacherEmail = responsibleTeacherEmail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setResponsibleTeacher(String responsibleTeacher) {
        this.responsibleTeacher = responsibleTeacher;
    }

    public String getTitle() {
        return title;
    }

    public String getResponsibleTeacherEmail() {
        return responsibleTeacherEmail;
    }

    public String getResponsibleTeacher() {
        return responsibleTeacher;
    }

    public int getId() {
        return id;
    }

    public int getModuleNumber() {
        return moduleNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModuleNumber(int moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }
}
