package com.company;

public class Profile {

    private  String name;
    private int age;
    private String hobby;
    private  String gender;
    private String interestedIn;


    private Swipe swipeUsers;

    public Profile(Swipe swipeUsers) {
        if ( swipeUsers.equals(null)){
            System.out.println(" Awww, you should activate premium version");
        }
        this.swipeUsers = new Swipe();
    }

    public Profile() {

    }

    public void info(){
        System.out.println(" You are watching the profile of " + name + '\t'+
                " AGE" + age + '\t' +
                " Hobby" + hobby +'\t'+
                "Gender " + gender+ '\t'
            + " InterestedIn " + interestedIn);
    }

    public Swipe getSwipeUsers() {
        return swipeUsers;
    }

    public int getAge() {
        return age;
    }
}
