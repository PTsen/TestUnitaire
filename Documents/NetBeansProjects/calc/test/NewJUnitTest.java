
import calc.Calc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author @author Ping Tian-sen
 */
public class NewJUnitTest {
    
    public NewJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
    @Test 
    public void multiplicationTest(){
    
        Calc c = new Calc ();
        
        assertEquals(" integer X 0 doit donner 0",0,c.multiplication(10, 0));
        assertEquals(" 0 X integer doit donner 0",0,c.multiplication(0, 10));
        assertEquals(" 0 X 0 doit donner 0",0,c.multiplication(0, 0));
        assertEquals(" 10 X 10 doit donner 100",100,c.multiplication(10, 10));
        assertEquals(" -1 X 10 doit donner -10",-10,c.multiplication(-1, 10));
    }
    
    
     @Test(expected = java.lang.ArithmeticException.class)
    public void divisionPar0Test(){
    
        Calc c = new Calc ();
        
        c.division(10, 0);
        
    }
    
    
    @Test
    public void additionTest(){
        Calc c = new Calc ();
   
        assertEquals(" 1 + 0 doit donner 1",0,c.addition(0, 0));

    
    }
    
     @Test
    public void soustractionTest(){
        Calc c = new Calc ();
   
        assertEquals(" 1 - 1 doit donner 0",0,c.soustraction(1, 1));

    
    }
   
}
