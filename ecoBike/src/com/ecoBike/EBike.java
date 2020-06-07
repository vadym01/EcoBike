package com.ecoBike;

import java.util.Objects;

public class EBike {

    private String brand;
    private int maxSpeed;
    private int weightB;
    private boolean lightsFB;
    private int battery;
    private String color;
    private int price;

    public EBike(String brand, int maxSpeed, int weightB, boolean lightsFB, int battery, String color, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.weightB = weightB;
        this.lightsFB = lightsFB;
        this.battery = battery;
        this.color = color;
        this.price = price;
    }

    public EBike() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeightB() {
        return weightB;
    }

    public void setWeightB(int weightB) {
        this.weightB = weightB;
    }

    public boolean isLightsFB() {
        return lightsFB;
    }

    public void setLightsFB(boolean lightsFB) {
        this.lightsFB = lightsFB;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



//    private String brand;
//    private int maxSpeed;
//    private int weightB;
//    private boolean lightsFB;
//    private int battery;
//    private String color;
//    private int price;
//
    @Override
    public String toString() {
        String include;
        if(lightsFB) {
            include = "";
        }else {
            include = " no";
        }
        return brand +
                " with " + battery + " mAh " +
                "battery and" + include + " head/tail light.\n"
                + "Price: " + price + " euros.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EBike eBike = (EBike) o;
        return maxSpeed == eBike.maxSpeed &&
                weightB == eBike.weightB &&
                lightsFB == eBike.lightsFB &&
                battery == eBike.battery &&
                price == eBike.price &&
                brand.equals(eBike.brand) &&
                color.equals(eBike.color);
    }


}
