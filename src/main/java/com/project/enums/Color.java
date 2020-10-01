package com.project.enums;

public enum Color {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    PURPLE("Purple"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    BLACK("Black"),
    WHITE("White");

    private String color;

    public String getColor() {
        return color;
    }

    Color(String color) {
        this.color = color;
    }

}
