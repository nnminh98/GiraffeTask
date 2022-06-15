import com.csg.Giraffe.Product;
import com.csg.Giraffe.ZooIceCreamParlour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProduct {
    @Test
    public void setPromoTest1(){
        Product product = new Product("Rocky Road", 8);
        product.setPromo(2,1,0);
        Assertions.assertEquals(3, product.getPromo()[0]);
        Assertions.assertEquals(16, product.getPromo()[1]);
    }

    @Test
    public void setPromoTest2(){
        Product product = new Product("Rocky Road", 0);
        product.setPromo(2,1,0);
        Assertions.assertEquals(3, product.getPromo()[0]);
        Assertions.assertEquals(0, product.getPromo()[1]);
    }

    @Test
    public void setPromoTest3(){
        Product product = new Product("Rocky Road", 8);
        product.setPromo(2,1,1);
        Assertions.assertEquals(3, product.getPromo()[0]);
        Assertions.assertEquals(24, product.getPromo()[1]);
    }

    @Test
    public void setPromoTest4(){
        Product product = new Product("Rocky Road", 8);
        product.setPromo(0,0,0);
        Assertions.assertArrayEquals(null, product.getPromo());
    }

    @Test
    public void deletePromoTest(){
        Product product = new Product("Rocky Road", 8, 2, 1,0.6);
        product.deletePromo();
        Assertions.assertArrayEquals(null, product.getPromo());
    }
}
