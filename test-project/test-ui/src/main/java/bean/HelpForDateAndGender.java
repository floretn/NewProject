package bean;

import model.Model;

import java.util.Date;

public class HelpForDateAndGender {

    private final Model.Gender genderM = Model.Gender.M;
    private final Model.Gender genderW = Model.Gender.W;
    private Date date;
    private Model.Gender gender;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Model.Gender getGender() {
        return gender;
    }

    public void setGender(Model.Gender gender) {
        this.gender = gender;
    }

    public Model.Gender getGenderM() {
        return genderM;
    }

    public Model.Gender getGenderW() {
        return genderW;
    }
}
