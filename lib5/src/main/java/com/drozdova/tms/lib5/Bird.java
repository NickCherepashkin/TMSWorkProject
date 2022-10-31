package com.drozdova.tms.lib5;

public class Bird {
    private String kind;
    private String color;
    private int height;
    private int weight;

    public Bird() {
    }

    public Bird(String kind, String color, int height, int weight) {
        this.kind = kind;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "kind='" + kind + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
