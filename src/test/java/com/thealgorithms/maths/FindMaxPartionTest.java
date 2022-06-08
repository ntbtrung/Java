package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static com.thealgorithms.maths.FindMax.findMax;
import static org.junit.jupiter.api.Assertions.*;

public class FindMaxPartionTest {
    @Test
    // Array of even numbers
    public void maxOfArrayEven() {
        assertEquals(10,FindMax.findMax(new int[] {0,2,4,6,8,10}));
    }
    @Test
    // Array of odd numbers
    public void maxOfArrayOdd() {
        assertEquals(5,FindMax.findMax(new int []{1,3,5}));
    }
    @Test
    // Array of integer numbers
    public void maxOfArrayInt() {
        assertEquals(10,FindMax.findMax(new int[] {0,1,2,3,4,5,6,7,8,9,10}));
    }
}