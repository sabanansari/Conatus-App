package com.example.my.conatus;


public class Team {

    private String Name;
    private String Year;
    private String Designation;
    private String About;
    private int Thumabnail;

    public Team(String name, String year, String designation,String about, int thumabnail) {
        Name = name;
        Year = year;
        Designation = designation;
        Thumabnail = thumabnail;
        About = about;
    }

    public Team() {

    }

    public String getAbout(){
        return About;
    }

    public String getName() {
        return Name;
    }

    public String getYear() {
        return Year;
    }

    public String getDesignation() {
        return Designation;
    }

    public int getThumabnail() {
        return Thumabnail;
    }

    public void setAbout(String about){
        About = about;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public void setThumabnail(int thumabnail) {
        Thumabnail = thumabnail;
    }
}


