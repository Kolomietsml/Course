import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {
    private static Arithmetics arithmetics;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void initTest(){
        arithmetics = new Arithmetics();
    }

    @Test
    public void testAdd(){
        double res = arithmetics.add(3, 7);
        Assert.assertEquals( res,10.0,  0.0);
    }

    @Test
    public void testDeduct(){
        double res = arithmetics.deduct(3, 7);
        Assert.assertEquals(res, -4, 0.0);
    }

    @Test
    public void testMult(){
        double res = arithmetics.mult(3, 7);
        Assert.assertEquals(res, 21, 0.0);
    }

    @Test
    public void testDiv(){
        double res = arithmetics.div(10, 5);
        Assert.assertEquals(res, 2.0, 0.0);
    }

    //@Test(expected = Exception.class)
    @Test
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        arithmetics.div(10.0,0.0);
    }
    @Test
    public void testN(){
        while (true){

        }
    }
}
