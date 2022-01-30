package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;

    private String[] operatingSystems;

    private LinkedHashMap<String, String> countryOptions;

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    //Daca populam din clasa java
    private ArrayList<String> favouriteLanguage2;

    public ArrayList<String> getFavouriteLanguage2() {
        return favouriteLanguage2;
    }

    public void setFavouriteLanguage2(ArrayList<String> favouriteLanguage2) {
        this.favouriteLanguage2 = favouriteLanguage2;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public Student(){
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("MD", "Moldova");
        countryOptions.put("RO", "Romania");
        countryOptions.put("UK", "Ukraina");

        favouriteLanguage2 = new ArrayList<>();
        favouriteLanguage2.add("C++");
        favouriteLanguage2.add("Java");
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
