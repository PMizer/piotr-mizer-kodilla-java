package com.kodilla.testing.forum.statistics;


import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

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
    public void testForumStatZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postCount);

        int commentCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        ArrayList<String> forumUsers = new ArrayList<String>();
        forumUsers.add("Piotrek");
        forumUsers.add("Janek");

        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When

        ForumStat forumStat = new ForumStat();
        forumStat.calculateAdvStatistics(statisticsMock);

        int result = forumStat.getPostsCount();

        //Then

        Assert.assertEquals(0,result);
    }

    @Test
    public void testForumStatThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postCount);

        int commentCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        ArrayList<String> forumUsers = new ArrayList<String>();
        forumUsers.add("Piotrek");
        forumUsers.add("Janek");

        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When

        ForumStat forumStat = new ForumStat();
        forumStat.calculateAdvStatistics(statisticsMock);

        int result = forumStat.getPostsCount();

        //Then

        Assert.assertEquals(1000,result);
    }

    @Test
    public void testForumStatZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 100;
        when(statisticsMock.postsCount()).thenReturn(postCount);

        int commentCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        ArrayList<String> forumUsers = new ArrayList<String>();
        forumUsers.add("Piotrek");
        forumUsers.add("Janek");

        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When

        ForumStat forumStat = new ForumStat();
        forumStat.calculateAdvStatistics(statisticsMock);

        int result = forumStat.getCommentsCount();

        //Then

        Assert.assertEquals(0,result);
    }

    @Test
    public void testForumStatLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 100;
        when(statisticsMock.postsCount()).thenReturn(postCount);

        int commentCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        ArrayList<String> forumUsers = new ArrayList<String>();
        forumUsers.add("Piotrek");
        forumUsers.add("Janek");

        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When

        ForumStat forumStat = new ForumStat();
        forumStat.calculateAdvStatistics(statisticsMock);

        boolean result = forumStat.getPostsCount()>forumStat.getCommentsCount();

        //Then

        Assert.assertTrue(result);
    }

    @Test
    public void testForumStatMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 1;
        when(statisticsMock.postsCount()).thenReturn(postCount);

        int commentCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        ArrayList<String> forumUsers = new ArrayList<String>();
        forumUsers.add("Piotrek");
        forumUsers.add("Janek");

        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When

        ForumStat forumStat = new ForumStat();
        forumStat.calculateAdvStatistics(statisticsMock);

        boolean result = forumStat.getPostsCount()<forumStat.getCommentsCount();

        //Then

        Assert.assertTrue(result);
    }

    @Test
    public void testForumStatZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 20;
        when(statisticsMock.postsCount()).thenReturn(postCount);

        int commentCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        ArrayList<String> forumUsers = new ArrayList<String>();


        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When

        ForumStat forumStat = new ForumStat();
        forumStat.calculateAdvStatistics(statisticsMock);

        int result = forumStat.getUsersNamesQuantity();

        //Then

        Assert.assertEquals(0,result);
    }

    @Test
    public void testForumStatHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 300;
        when(statisticsMock.postsCount()).thenReturn(postCount);

        int commentCount = 10;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        ArrayList<String> forumUsers = new ArrayList<String>();
        for(int i = 0 ; i < 100 ; i++){
            forumUsers.add("Wojtek "+i);
        }

        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When

        ForumStat forumStat = new ForumStat();
        forumStat.calculateAdvStatistics(statisticsMock);

        int result = forumStat.getUsersNamesQuantity();

        //Then

        Assert.assertEquals(100,result);
    }
}
