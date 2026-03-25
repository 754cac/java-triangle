package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testScalene() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("Scalene", t.getTriangleType());
    }

    @Test
    public void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertEquals("Equilateral", t.getTriangleType());
    }    

    @Test
    public void testIsoceles() {
        Triangle t1 = new Triangle(3, 3, 5);
        assertEquals("Isosceles", t1.getTriangleType());
    }

    @Test
    public void testNotTriangle1() {
        //TODO: add your test cases 
        Triangle t2 = new Triangle(1, 2, 3);
        assertEquals("Error: Not a triangle", t2.getTriangleType());
    }

    @Test
    public void sidesShouldBePositive() {
        //TODO: add your test cases 
        Triangle t3 = new Triangle(-1, 2, 3);
        assertEquals("Error: The length should be positive", t3.getTriangleType());
    }

    @Test
    public void sideZeroNotAllowed() {
        Triangle t4 = new Triangle(0, 1, 1);
        assertEquals("Error: The length should be positive", t4.getTriangleType());
    }

    @Test
    public void sideBNegativeNotAllowed() {
        Triangle t5 = new Triangle(1, -1, 1);
        assertEquals("Error: The length should be positive", t5.getTriangleType());
    }

    @Test
    public void sideCNegativeNotAllowed() {
        Triangle t6 = new Triangle(1, 1, -1);
        assertEquals("Error: The length should be positive", t6.getTriangleType());
    }

    @Test
    public void triangleInequalityFailsForA() {
        Triangle t7 = new Triangle(10, 1, 1);
        assertEquals("Error: Not a triangle", t7.getTriangleType());
    }

    @Test
    public void triangleInequalityFailsForB() {
        Triangle t8 = new Triangle(1, 10, 1);
        assertEquals("Error: Not a triangle", t8.getTriangleType());
    }

    @Test
    public void triangleInequalityFailsForC() {
        Triangle t9 = new Triangle(1, 1, 10);
        assertEquals("Error: Not a triangle", t9.getTriangleType());
    }

    @Test
    public void isoscelesBcEqual() {
        Triangle t10 = new Triangle(3, 5, 5);
        assertEquals("Isosceles", t10.getTriangleType());
    }

    @Test
    public void isoscelesAcEqual() {
        Triangle t11 = new Triangle(5, 3, 5);
        assertEquals("Isosceles", t11.getTriangleType());
    }
}

