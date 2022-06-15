package com.csg.Giraffe;

import java.util.HashMap;

public class ZooIceCreamParlour {
    private HashMap<String, Product> products;

    public ZooIceCreamParlour(){
        this.products = new HashMap<String, Product>();
    }

    public void addProduct(String name, double price){
        Product product = new Product(name, price);
        this.products.put(name, product);
    }

    public void addProduct(String name, double price, int buyThisMuch, int getThisMuch, double atThisPercent){
        this.addProduct(name, price);
        this.addPromo(name, buyThisMuch, getThisMuch, atThisPercent);
    }

    public void addPromo(String name, int buyThisMuch, int getThisMuch, double atThisPercent) {
        try {
            this.products.get(name).setPromo(buyThisMuch, getThisMuch, atThisPercent);
        } catch (NullPointerException e) {
            System.out.println("There is no product named " + name);
        }
    }

    public void setPrice(String name, double price) {
        try {
            this.products.get(name).setPrice(price);
        } catch (NullPointerException e) {
            System.out.println("There is no product named " + name);
        }
    }

    public void deleteProduct(String name) {
        this.products.remove(name);
    }

    public void deletePromo(String name) {
        try {
            this.products.get(name).deletePromo();
        } catch (NullPointerException e) {
            System.out.println("There is no product named " + name);
        }
    }

    public double processOrders(HashMap<String, Integer> orders) {
        double totalCost = 0;
        for (String key : orders.keySet()) {
            if (this.products.containsKey(key)) {
                int amount = orders.get(key);
                Product product = this.products.get(key);
                if (product.getPromo() == null) {
                    totalCost += amount * product.getPrice();
                    continue;
                }
                totalCost += (int)(amount / product.getPromo()[0]) * product.getPromo()[1] +
                        (amount % product.getPromo()[0]) * product.getPrice();
            }
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "com.csg.Giraffe.ZooIceCreamParlour{" +
                "products=" + products +
                '}';
    }
}
