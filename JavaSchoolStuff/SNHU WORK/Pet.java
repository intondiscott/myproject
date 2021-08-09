package com.PetAppProgramm.PetApp;



public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int daysStay;
    private double amountDue;
    Pet(){

    }

    public Pet(String petType,String petName, int petAge) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
    }



    public String getPetType(){
        return petType;
    }

    public void setPetType(String petType){
        this.petType = petType;
    }

    public String getPetName(){
        return petName;
    }

    public void setPetName(String petName){
        this.petName = petName;

    }

    public int getPetAge(){
        return petAge;
    }

    public void setPetAge(int petAge){
        this.petAge = petAge;
    }

    public int getDogSpaces(){
        return dogSpaces;
    }

    public void setDogSpaces(int dogSpaces){
        this.dogSpaces = dogSpaces;
    }

    public int getDaysStay(){
        return daysStay;
    }

    public void setDaysStay(int daysStay){
        this.daysStay = daysStay;
    }

    public double getAmountDue(){
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }


}
