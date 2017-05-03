package models;

import java.util.List;

/**
 * Created by Jan on 26.04.2017.
 */
public class Participant {

    private String date;
    private List<Fwpm> fwpms;


    public Participant() {

    }


    public List<Fwpm> getFwpms() {
        return fwpms;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFwpms(List<Fwpm> fwpms) {
        this.fwpms = fwpms;
    }
}
