package com.example.petform.moduls;

public class Pet {

    private String petName;
    private String petAge;
    private String petFood;

    public Pet(String petName, String petAge, String petFood) {
        this.petName = petName;
        this.petAge = petAge;
        this.petFood = petFood;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public String getPetFood() {
        return petFood;
    }

    public void setPetFood(String petFood) {
        this.petFood = petFood;
    }
}
