package com.luv2code.springdemo.mvc;

import validation.someAnnotation;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Max(value = 10, message = "must be less than 10")
    @Min(value = 1, message = "Must be greater than 0")
    private Integer someNumber;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Pattern(regexp = "[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String postalCode;


    //Customized @someAnnotation(value = "YEZZ", message = "have to start with YEZZ")
    @someAnnotation
    private String myAnnotTest;

    public String getMyAnnotTest() {
        return myAnnotTest;
    }

    public void setMyAnnotTest(String myAnnotTest) {
        this.myAnnotTest = myAnnotTest;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(Integer someNumber) {
        this.someNumber = someNumber;
    }

    public String getFirstName() {
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
