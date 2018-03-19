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

    public double getAverageUserPost(){
        return averageUserPost;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    void calculateAdvStatistics(Statistics statistics){
        userNamesQuantity = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(userNamesQuantity == 0){
            averageUserPost = 0;
        }else{
            averageUserPost = postsCount / userNamesQuantity;
        }
        if(userNamesQuantity == 0){
            averageCommentsPerUser = 0;
        }else {
            averageCommentsPerUser = commentsCount / userNamesQuantity;
        }
        if(postsCount == 0){
            averageCommentsPerPost = 0;
        }else {
            averageCommentsPerPost = commentsCount / postsCount;
        }
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
