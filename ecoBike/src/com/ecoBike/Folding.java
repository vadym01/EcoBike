package com.ecoBike;

import java.util.Objects;

public class Folding {

    private String brand;
    private int size;
    private int nGears;
    private int weightB;
    private boolean lightsFB;
    private String color;
    private int price;

    public Folding(String brand, int size, int nGears, int weightB, boolean lightsFB, String color, int price) {
        this.brand = brand;
        this.size = size;
        this.nGears = nGears;
        this.weightB = weightB;
        this.lightsFB = lightsFB;
        this.color = color;
        this.price = price;
    }

    public Folding() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getnGears() {
        return nGears;
    }

    public void setnGears(int nGears) {
        this.nGears = nGears;
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

//    @Override
//    public String toString() {
//        return "Folding{" +
//                "brand='" + brand + '\'' +
//                ", size=" + size +
//                ", nGears=" + nGears +
//                ", weightB=" + weightB +
//                ", available=" + available +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                '}';
//    }

    @Override
    public String toString() {
        String include;
        if(lightsFB) {
            include = "";
        }else {
            include = " no";
        }

        return brand +
                " with " + nGears + " gear(s) " +
                "and" + include + " head/tail light.\n"
                + "Price: " + price + " euros.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Folding folding = (Folding) o;
        return size == folding.size &&
                nGears == folding.nGears &&
                weightB == folding.weightB &&
                lightsFB == folding.lightsFB &&
                price == folding.price &&
                brand.equals(folding.brand) &&
                color.equals(folding.color);
    }


}
