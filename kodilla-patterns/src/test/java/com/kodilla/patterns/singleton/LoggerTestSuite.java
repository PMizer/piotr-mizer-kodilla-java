package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void openLogger() {
        Logger.getLoggerInstance().log("importantLog");
    }

    @Test
    public void testLastLog() {
        //Given
        //When
        String lastLog = Logger.getLoggerInstance().getLastLog();
        //Then
        Assert.assertEquals(lastLog, "importantLog");
    }
}

