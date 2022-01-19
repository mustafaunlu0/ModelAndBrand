package com.example.landmarkdenemesi;

import java.io.Serializable;

public class Landmark implements Serializable {
    String model;
    String brand;
    int image;

    public Landmark(String model, String brand, int image) {
        this.model = model;
        this.brand = brand;
        this.image = image;
    }
}
