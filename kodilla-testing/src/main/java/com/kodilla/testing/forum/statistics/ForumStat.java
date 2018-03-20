package com.kodilla.testing.forum.statistics;


import java.util.List;

public class ForumStat  {
    Statistics statistics;

    private int userNamesQuantity;
    private int postsCount;
    private int commentsCount;
    private double averageUserPost;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUsersNamesQuantity(){
        return userNamesQuantity;
    }

    public int getPostsCount(){
        return postsCount;
    }

    public int getCommentsCount(){
        return commentsCount;
    }

    public Double getAverageUserPost(){
        return averageUserPost;
    }

    public Double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public Double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    void calculateAdvStatistics(Statistics statistics){
        userNamesQuantity = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averageUserPost = (double)postsCount / userNamesQuantity;
        averageCommentsPerUser = (double)commentsCount / userNamesQuantity;
        averageCommentsPerPost = (double)commentsCount / postsCount;

    }
    void showStatistics(){
        System.out.println(userNamesQuantity);
        System.out.println(postsCount);
        System.out.println(commentsCount);
        System.out.println(averageUserPost);
        System.out.println(averageCommentsPerUser);
        System.out.println(averageCommentsPerPost);
    }
}
