package EticaretSystem.Entities.Concretes;

import EticaretSystem.Entities.Abstracts.Entity;

public class User implements Entity {




    private int id;
    private String name;
    private String lastName;
    private String eMail;
    private String password;
    private boolean verify;


    public User(int id, String name, String lastName, String eMail, String password, boolean verify) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;
        this.verify = verify;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }

    }

