package com.example.petform.moduls;

public class User {
    private String name;
    private String age;
    private String gender;
    private boolean pet;

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public User(String name, String age, String gender,boolean pet) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
