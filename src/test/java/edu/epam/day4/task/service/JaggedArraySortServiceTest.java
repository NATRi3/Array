package edu.epam.day4.task.service;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;

public class JaggedArraySortServiceTest {


    public static int[][]objArray;
    public static int[][]expectedSum;
    public static int[][]expectedMin;
    public static int[][]expectedMax;
    @BeforeMethod
    public static void createArray(){
        objArray = new int[][]{{2, 6, 8, 5}, {2, 1, 2, 3}, {1, 2, 2, 2}, {3, 3, 4, 5}, {4, 6, 2, 1}};
        expectedSum = new int[][]{{8,6,5,2},{5,4,3,3}, {6,4,2,1}, {3,2,2,1}, {2,2,2,1}};
        expectedMin = new int[][]{{6,4,2,1},{3,2,2,1},{2,2,2,1},{8,6,5,2},{5,4,3,3}};
        expectedMax = new int[][]{{8,6,5,2},{6,4,2,1},{5,4,3,3},{3,2,2,1},{2,2,2,1}};
    }

    @AfterMethod
    public static void nullArray(){
        objArray = null;
        expectedSum = null;
        expectedMin = null;
        expectedMax = null;
    }

    @Test
    public void testSumJaggedArraySort() {
        new JaggedArraySortService().jaggedArraySort(objArray,TypeSort.sum);
        for(int[]j:objArray) {
            for(int i: j) {
                System.out.print(i+",");
            }
            System.out.println("");
        }
        Assert.assertEquals(objArray,expectedSum);
    }
    @Test
    public void testMinJaggedArraySort() {
        new JaggedArraySortService().jaggedArraySort(objArray,TypeSort.min);
        for(int[]j:objArray) {
            for(int i: j) {
                System.out.print(i+",");
            }
            System.out.println("");
        }
        Assert.assertEquals(objArray,expectedMin);
    }
    @Test
    public void testMaxJaggedArraySort() {
        new JaggedArraySortService().jaggedArraySort(objArray,TypeSort.max);
        for(int[]j:objArray) {
            for(int i: j) {
                System.out.print(i+",");
            }
            System.out.println("");
        }
        Assert.assertEquals(objArray,expectedMax);
    }
}