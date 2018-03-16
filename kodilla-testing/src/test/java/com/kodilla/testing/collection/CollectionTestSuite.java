package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        ArrayList<Integer> testOdd = new ArrayList<Integer>();
        testOdd.add(5);
        testOdd.add(2);

        //When

        OddNumbersExterminator exterminate = new OddNumbersExterminator();
        ArrayList<Integer> result =  exterminate.exterminate(testOdd);

        System.out.println("Testing Normal List " + result);

        //Then
        ArrayList<Integer> expectedArray = new ArrayList<Integer>();
        expectedArray.add(2);
        Assert.assertEquals(expectedArray, result);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){
        //Given
        ArrayList<Integer> testOdd = new ArrayList<Integer>();

        //When

        OddNumbersExterminator exterminate = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminate.exterminate(testOdd);

        System.out.println("Testing Empty List " + result);

        //Then
        ArrayList<Integer> expectedArray = new ArrayList<Integer>();
        Assert.assertEquals(expectedArray, result);
    }

}
