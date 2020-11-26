package edu.epam.task.service;

import edu.epam.task.array.NumberArray;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArraySortServiceTest {
    public static int[] actual;
    public static int[] expected;

    @BeforeMethod
    public static void createArray(){
        actual = new int[]{1, 15, 13, 6};
        expected = new int[]{15,13,6,1};
    }

    @AfterMethod
    public static void nullArray(){
        actual = null;
        expected = null;
    }

    @Test
    public void testBubbleSortArray() {
        new ArraySortService().bubbleSortArray(actual);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTestBubbleSortArray() {
        new ArraySortService().bubbleSortArray(new NumberArray(actual));
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSelectionSortArray() {
        new ArraySortService().bubbleSortArray(actual);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testQuickSort() {
        new ArraySortService().bubbleSortArray(actual);
        Assert.assertEquals(expected,actual);
    }
}