package edu.epam.task.arrayreader;

import edu.epam.task.array.NumberArray;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayCreatorServiceTest {

    public static NumberArray array = null;
    @AfterMethod
    public static void nullArray(){
        array = null;
    }
    @Test
    public void testCreateRandomNumberArray() {
        array = new NumberArray(new ArrayCreatorService().CreateRandomNumberArray());
        Assert.assertNotNull(array);
    }

    @Test
    public void testFileReaderNumberArray() {
        array = new NumberArray(new ArrayCreatorService().FileReaderNumberArray("data\\data.txt"));
        Assert.assertNotNull(array);
    }
}