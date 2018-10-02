/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thota
 */
public class Week3Test {
    
    public Week3Test() {
    }

    @Test
    public void testMax() {
        System.out.println("max");
        int m = 5;
        int n = 3;
        int expResult = 6;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testMinOfArray() {
        System.out.println("minOfArray");
        int[] array = null;
        int expResult = 0;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculateBMI() {
        System.out.println("calculateBMI");
        double weight = 0.0;
        double height = 0.0;
        String expResult = "";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
