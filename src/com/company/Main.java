package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Resume resume = new Resume();

        Scanner scanner = new Scanner(System.in);
        String name;
        String email;
        Boolean addEduHistory = true;
        Boolean addExpHistory = true;
        Boolean addSkill = true;
        String eduresult;
        String expresult;
        String skresult;


        //ASK USER FOR NAME
        System.out.print("This is a resume builder, Please enter your name: ");

        name = scanner.nextLine();
        resume.setName(name);

        //ASK USER FOR EMAIL
        System.out.print("Please enter your email: ");

        email = scanner.nextLine();
        resume.setEmailAddress(email);

        while (addEduHistory) {
            //ASK IF USER HAS EDUCATION HISTORY
            System.out.print("Would you like to provide Educational history? Please enter y(Yes) or n(No): ");
            eduresult = scanner.nextLine();

            if (eduresult.equalsIgnoreCase("n")) {
                addEduHistory = false;
            } else {

                String userDegreeLevel, userMajor, userGradYear, userUniversityname;


                System.out.print("Please enter your degree level: ");
                userDegreeLevel = scanner.nextLine();

                System.out.println("Please enter your Major: ");
                userMajor = scanner.nextLine();

                System.out.println("Please enter your grad year: ");
                userGradYear = scanner.nextLine();

                System.out.println("Please enter your university name:  ");
                userUniversityname = scanner.nextLine();


                resume.addEducation(new Education(userDegreeLevel, userMajor, userUniversityname, userGradYear));


            }
        }


        while (addExpHistory) {
            System.out.print("Provide job experience? Please enter y(yes) or nNo); ");
            expresult = scanner.nextLine();

            if (expresult.equalsIgnoreCase("n")) {
                addExpHistory = false;
            } else {

                String userCompany, userJobTitle, userStartDate, UserEndDate, userJobDiscription;

                System.out.print("Please enter your Company name: ");
                userCompany = scanner.nextLine();

                System.out.print("Please enter you job title: ");
                userJobTitle = scanner.nextLine();

                System.out.print("enter your start date: ");
                userStartDate = scanner.nextLine();

                System.out.print("enter your end date: ");
                UserEndDate = scanner.nextLine();

                System.out.print("Please enter your job discription");
                userJobDiscription = scanner.nextLine();


                resume.addExperience(new Experience(userCompany, userJobTitle, userStartDate, UserEndDate, userJobDiscription));
            }

            while (addSkill) {
                System.out.print("would you like to add skills (y/n)");
                skresult = scanner.nextLine();

                if (skresult.equalsIgnoreCase("n")) {
                    addSkill = false;
                } else {

                    String skillName, skillCompetency;

                    System.out.print("Please enter skill");
                    skillName = scanner.nextLine();

                    System.out.print("Please enter Competency for skill");
                    skillCompetency = scanner.nextLine();

                    resume.addSkill(new Skill(skillName, skillCompetency));



                }


            }


        }


    }
}