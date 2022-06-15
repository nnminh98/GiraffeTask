package com.csg.Giraffe;

import java.util.*;

public class Main {

    public static void main(String[] args){
        ZooIceCreamParlour zooIceCreamParlour = new ZooIceCreamParlour();
        zooIceCreamParlour.addProduct("Rocky Road", 8, 2, 1, 0);
        zooIceCreamParlour.addProduct("Cookies & Cream", 10, 2, 1, 0.5);
        zooIceCreamParlour.addProduct("Netflix & Chill", 12);

        HashMap<String, Integer> orders = new HashMap<String, Integer>();
        orders.put("Rocky Road", 1);
        orders.put("Cookies & Cream", 3);
        orders.put("Netflix & Chill", 2);
        double price = zooIceCreamParlour.processOrders(orders);
        System.out.println(price);
    }
}
