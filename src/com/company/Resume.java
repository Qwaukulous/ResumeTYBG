package com.company;
import java.util.ArrayList;


public class Resume {
    private String name;
    private String emailAddress;
    ArrayList<Experience> experience = new ArrayList<>();
    ArrayList<Education> education = new ArrayList<>();
    ArrayList<Skill> skills = new ArrayList<>();

    public Resume() {

    }

    public Resume(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    //Get & Add Experience
    private String getExperience(){
        String st = "";
        for (Experience exp : experience){
            st.concat(exp + "\n");
        }
        return st;
    }

    public void addExperience(Experience exp) {
        experience.add(exp);
    }

    //Get & Add Education
    private String getEducation() {
        String st = "";
        for (Education edu : education){
            st.concat(edu + "\n");

        }
        return st;
    }

    public void addEducation(Education edu) {
        education.add(edu);
    }

    //Get & Add Skills
    private String getSkills(){
        String st = "";
        for (Skill skill : skills){
            st.concat(skills + "\n");
        }
        return st;
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }

    public String getResume() {
        return "===========================================================\n" +getName() + "\n" + getEmailAddress() +
                "\nEDUCATION\n" + getEducation() + "EXPERIENCE\n" + getExperience() + "Skills\n" + getSkills();
    }
}
