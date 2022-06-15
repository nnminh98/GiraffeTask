import com.csg.Giraffe.ZooIceCreamParlour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestZooIceCreamParlour {

    @Test
    public void processOrdersTestBase1(){
        ZooIceCreamParlour zooIceCreamParlour = new ZooIceCreamParlour();
        zooIceCreamParlour.addProduct("Rocky Road", 8, 2, 1, 0);
        zooIceCreamParlour.addProduct("Cookies & Cream", 10, 2, 1, 0.5);
        zooIceCreamParlour.addProduct("Netflix & Chill", 12);

        HashMap<String, Integer> orders = new HashMap<String, Integer>();
        orders.put("Rocky Road", 1);
        orders.put("Cookies & Cream", 3);
        orders.put("Netflix & Chill", 2);
        double price = zooIceCreamParlour.processOrders(orders);
        Assertions.assertEquals(57, price);
    }

    @Test
    public void processOrdersTestBase2(){
        ZooIceCreamParlour zooIceCreamParlour = new ZooIceCreamParlour();
        zooIceCreamParlour.addProduct("Rocky Road", 8, 2, 1, 0);
        zooIceCreamParlour.addProduct("Cookies & Cream", 10, 2, 1, 0.5);
        zooIceCreamParlour.addProduct("Netflix & Chill", 12);

        HashMap<String, Integer> orders = new HashMap<String, Integer>();
        orders.put("Rocky Road", 3);
        double price = zooIceCreamParlour.processOrders(orders);
        Assertions.assertEquals(16, price);
    }

    @Test
    public void processOrdersTestBase3(){
        ZooIceCreamParlour zooIceCreamParlour = new ZooIceCreamParlour();
        zooIceCreamParlour.addProduct("Rocky Road", 8, 2, 1, 0);
        zooIceCreamParlour.addProduct("Cookies & Cream", 10, 2, 1, 0.5);
        zooIceCreamParlour.addProduct("Netflix & Chill", 12);

        HashMap<String, Integer> orders = new HashMap<String, Integer>();
        orders.put("Rocky Road", 20);
        orders.put("Cookies & Cream", 10);
        orders.put("Netflix & Chill", 15);
        double price = zooIceCreamParlour.processOrders(orders);
        Assertions.assertEquals(377, price);
    }

    @Test
    public void processOrdersTestZeroPrice(){
        ZooIceCreamParlour zooIceCreamParlour = new ZooIceCreamParlour();
        zooIceCreamParlour.addProduct("Rocky Road", 0, 2, 1, 0);
        zooIceCreamParlour.addProduct("Cookies & Cream", 0, 2, 1, 0.5);
        zooIceCreamParlour.addProduct("Netflix & Chill", 0);

        HashMap<String, Integer> orders = new HashMap<String, Integer>();
        orders.put("Rocky Road", 1);
        orders.put("Cookies & Cream", 3);
        orders.put("Netflix & Chill", 2);
        double price = zooIceCreamParlour.processOrders(orders);
        Assertions.assertEquals(0, price);
    }

    @Test
    public void processOrdersTestNonExistentProduct(){
        ZooIceCreamParlour zooIceCreamParlour = new ZooIceCreamParlour();
        zooIceCreamParlour.addProduct("Rocky Road", 0, 2, 1, 0);
        zooIceCreamParlour.addProduct("Cookies & Cream", 0, 2, 1, 0.5);
        zooIceCreamParlour.addProduct("Netflix & Chill", 0);

        HashMap<String, Integer> orders = new HashMap<String, Integer>();
        orders.put("Maple Syrup", 1);
        orders.put("Chocolate Chips", 3);
        orders.put("", 2);
        double price = zooIceCreamParlour.processOrders(orders);
        Assertions.assertEquals(0, price);
    }
}
