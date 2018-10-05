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

    @Test
    public void testMax() {
        assertEquals(5, Week3.max(-5,5));
    }
	@Test
	public void testMax1(){
		assertEquals(999, Week3.max(-9999,999));
	}
    @Test
	public void testMax2(){
		assertEquals(1, Week3.max(0,1));
	}
	@Test
	public void testMax3(){
		assertEquals(9, Week3.max(3,9));
	}	
	@Test
	public void testMax4(){
		assertEquals(9, Week3.max(3,9));
	}
	@Test
	public void testMax5(){
		assertEquals(55, Week3.max(3,55));
	}
	@Test			
    public void testMinOfArray() {

        int a5[]={1,1,2,3,4,5};
        assertEquals(1, Week3.minOfArray(a5));
    }
	@Test
	public void testMinOfArray1() {
		int a1[]={0,1,2,3,4,5};
		assertEquals(0, Week3.minOfArray(a1));
	}
	@Test
	public void testMinOfArray2() {
		int a2[]={5,4,3,2,1,0};
		assertEquals(0, Week3.minOfArray(a2));
	}
	@Test
	public void testMinOfArray3() {
		int a3[]={1,3,5,7,8,4};
		assertEquals(1, Week3.minOfArray(a3));
	}
	@Test
	public void testMinOfArray4() {
		int a4[]={0,0,0,0,0,0};
		assertEquals(0, Week3.minOfArray(a4));
	}

    @Test
    public void testCalculateBMI() { 
        assertEquals("Binh thuong",Week3.calculateBMI(50.5, 1.6));
    }
	@Test
	public void testCalculateBMI1() {
		assertEquals("Binh thuong",Week3.calculateBMI(65, 1.7));
	}
	@Test
	public void testCalculateBMI2() {
		assertEquals("Beo phi",Week3.calculateBMI(90,1.8));
	}
	@Test
	public void testCalculateBMI3() {
		assertEquals("Thieu can",Week3.calculateBMI(40, 1.59));
	}
	@Test
	public void testCalculateBMI4() {
		assertEquals("Binh thuong",Week3.calculateBMI(57,1.62));
	}
    
}
