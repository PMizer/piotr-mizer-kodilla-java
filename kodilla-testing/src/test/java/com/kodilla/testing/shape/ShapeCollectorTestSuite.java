package com.kodilla.testing.shape;
import com.kodilla.testing.shape.*;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test

    public void testAddFigure(){
        //Given
        Shape circle = new Circle("Circle",30);

        ShapeCollector shapeCollector = new ShapeCollector();


        //When

        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test

    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle("Circle",30);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);



        //When

        boolean result = shapeCollector.removeFigure(circle);


        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeList().size());
    }


}
