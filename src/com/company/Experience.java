package com.company;

public class Experience extends Resume {
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobDescription;

    public Experience() {
    }

    public Experience(String company, String jobTitle, String startDate, String endDate, String jobDescription) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
    }
}

//Experience