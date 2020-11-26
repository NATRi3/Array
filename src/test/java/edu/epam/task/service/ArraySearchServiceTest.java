package edu.epam.task.service;

import edu.epam.task.array.NumberArray;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArraySearchServiceTest {
    public static NumberArray array;
    public static int actual;
    public static int expected;
    public static ArraySearchService searchService = new ArraySearchService();

    @BeforeMethod
    public static void createArray(){
        array = new NumberArray(new int[]{1, 2, 2, 3, 4, 23, 66, 123, 222, 223, 256, 389});
        actual = 0;
    }

    @AfterMethod
    public static void nullArray(){
        array = null;
        expected = 0;
        actual = 0;
    }


    @Test
    public void testBinarySearch() {
        expected = 66;
        actual = searchService.binarySearch(array,expected);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSearchMaxNumber() {
        expected = 389;
        actual = searchService.searchMaxNumber(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSearchMinNumber() {
        expected = 1;
        actual = searchService.searchMinNumber(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSearchPrimeNumber() {
        int[] expected1 = new int[]{2,3,23,223,389};
        int []actual = searchService.searchPrimeNumber(array).getArray();
        Assert.assertEquals(actual,expected1);
    }

    @Test
    public void testSearchFibonacciNumber() {
        int[] expected1 = new int[]{1,2,2,3};
        int []actual = searchService.searchFibonacciNumber(array).getArray();
        Assert.assertEquals(actual,expected1);
    }

    @Test
    public void testSearchThreeDigitNumber() {
        int[] expected1 = new int[]{123,256,389};
        int []actual = searchService.searchThreeDigitNumber(array).getArray();
        Assert.assertEquals(actual,expected1);
    }
}