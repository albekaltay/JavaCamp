package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Game implements Entity {

    private int id;
    private String name;
    private double gamePrice;

    public Game(int id, String name, double gamePrice) {
        this.id = id;
        this.name = name;
        this.gamePrice = gamePrice;
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

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }



}
