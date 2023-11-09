package com.niklas.demo;

public enum Classes {

    WARRIOR("I am STRONK ", 15),
    MAGE("I am SMORT ", 15);

    public final String description;
    public final int health;

    Classes(String description, int health) {
        this.description = description;
        this.health = health
    }

}
