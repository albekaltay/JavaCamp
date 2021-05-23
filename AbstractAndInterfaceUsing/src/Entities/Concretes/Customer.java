package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Customer implements Entity {


    public int id;
    public String firstName;
    public String lastName;
    public int dayOfBird;
    public int monthOfBird;
    public int yearOfBird;
    private long nationalityId;


    public Customer(int id, String firstName, String lastName, int dayOfBird, int monthOfBird, int yearOfBird, long nationalityId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBird = dayOfBird;
        this.monthOfBird = monthOfBird;
        this.yearOfBird = yearOfBird;
        this.nationalityId=nationalityId;

    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDayOfBird() {
        return dayOfBird;
    }

    public void setDayOfBird(int dayOfBird) {
        this.dayOfBird = dayOfBird;
    }

    public int getMonthOfBird() {
        return monthOfBird;
    }

    public void setMonthOfBird(int monthOfBird) {
        this.monthOfBird = monthOfBird;
    }

    public int getYearOfBird() {
        return yearOfBird;
    }

    public void setYearOfBird(int yearOfBird) {
        this.yearOfBird = yearOfBird;
    }


    public long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(long nationalityId) {
        this.nationalityId = nationalityId;
    }
}


