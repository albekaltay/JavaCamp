package GameProject.Entities.Concretes;

import GameProject.Entities.Abstracts.Entity;

public class Gamer implements Entity {
    private int id;
    private String name;
    private String lastName;
    private int yearOfBirth;
    private long nationalityId;

    public Gamer(int id, String name, String lastName, int yearOfBirth, long nationalityId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(long nationalityId) {
        this.nationalityId = nationalityId;
    }





}
