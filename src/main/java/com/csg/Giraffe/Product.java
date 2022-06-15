package com.csg.Giraffe;

import java.util.Arrays;

public class Product {
    private final String name;
    private double price;
    private double[] promo = null;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int buyThisMuch, int getThisMuch, double atThisPercent){
        this(name, price);
        this.setPromo(buyThisMuch, getThisMuch, atThisPercent);
    }

    public double getPrice(){ return this.price; }

    public void setPrice(double price) {this.price = price; }

    public String getName() { return this.name; }

    public double[] getPromo() { return this.promo; }

    public void deletePromo() {
        this.promo = null;
    }

    public void setPromo(int buyThisMuch, int getThisMuch, double atThisPercent){
        if (buyThisMuch <= 0 || atThisPercent > 1 || getThisMuch < 0) return;
        this.promo = new double[2];
        this.promo[0] = buyThisMuch + getThisMuch;
        this.promo[1] = buyThisMuch * price + getThisMuch * price * atThisPercent;
    }

    @Override
    public String toString() {
        return "com.csg.Giraffe.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", promo=" + Arrays.toString(promo) +
                '}';
    }
}
