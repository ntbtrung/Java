package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxPartionTest {
    @Test
    // Array in descending order
    public void maxOfDescendingOrder() {
        assertEquals(10,FindMax.findMax(new int[] {10,9,8,7,6,5,4,3,2,1}));
    }

    @Test
    // Array of ascending numbers
    public void maxOfArrayInt() {
        assertEquals(10,FindMax.findMax(new int[] {1,2,3,4,5,6,7,8,9,10}));
    }
    
    @Test
    // Array of unsorted array
    public void maxOfArrayOdd() {
        assertEquals(8,FindMax.findMax(new int []{1,3,5,4,2,7,8}));
    }
}
