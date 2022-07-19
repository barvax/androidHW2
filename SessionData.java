package com.example.petform.moduls;

public class SessionData {

    private static SessionData instance;
    User user;
    Pet pet;

    public static SessionData getInstance(){
        if (instance==null){
            instance = new SessionData();

        }
        return  instance;
    }





    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }





    @Override
    public String toString() {
        return "SessionData{" +
                "user=" + user.getName() +
                ", pet=" + pet.getPetName() +
                '}';
    }
}
