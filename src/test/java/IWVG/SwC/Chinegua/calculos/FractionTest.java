package IWVG.SwC.Chinegua.calculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
   private Fraction pt;
   private Fraction pt2;
   
   @Before
   public void before(){
       pt2 = new Fraction();
       pt = new Fraction(1,2);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(1, pt.getNumerator());
        assertEquals(2, pt.getDenominator());
    }

    @Test
    public void testFraction() {
        assertEquals(1, pt2.getNumerator());
        assertEquals(1, pt2.getDenominator());
    }


    @Test
    public void testDecimal() {
        assertEquals(0.5, pt.decimal(),0.5);
    }
    
    @Test
    public void testLargerNumerator() {
        assertEquals(false,pt.largerNumerator());
    }

}
