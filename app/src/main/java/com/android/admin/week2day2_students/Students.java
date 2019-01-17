package com.android.admin.week2day2_students;

public class Students {
    private String name;
    private String major;
    private String minor;
    private String gpa;
    private String dob;
    private String homeCity;
    private String homeState;
    private String ssn;

    public Students() {
    }

    public Students(String name, String major, String minor, String gpa, String dob, String homeCity, String homeState, String ssn) {
        this.name = name;
        this.major = major;
        this.minor = minor;
        this.gpa = gpa;
        this.dob = dob;
        this.homeCity = homeCity;
        this.homeState = homeState;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
