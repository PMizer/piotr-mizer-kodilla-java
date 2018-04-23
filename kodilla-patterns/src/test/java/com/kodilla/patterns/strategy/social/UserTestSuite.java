package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User jan = new Millenials("Jan Kowalski");
        User piotr = new YGeneration("Piotr Nowak");
        User brajan = new ZGeneration("Brajan Bmw");
        //WHen
        String janSharing = jan.sharePost();
        System.out.println("Jan is "+janSharing);
        String piotrSharing = piotr.sharePost();
        System.out.println("Piotr is "+piotrSharing);
        String brajanSharing = brajan.sharePost();
        System.out.println("Brajan is "+brajanSharing);
        //Then
        Assert.assertEquals("Publishing on Facebook",janSharing);
        Assert.assertEquals("Publishing on Twitter",piotrSharing);
        Assert.assertEquals("Publishing on Snapchat",brajanSharing);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jan = new Millenials("Jan Kowalski");
        //When
        String janSharing = jan.sharePost();
        System.out.println("By default Jan is "+janSharing);
        jan.setSocialPublisher(new TwitterPublisher());
        janSharing = jan.sharePost();
        System.out.println("But now he is "+janSharing);
        //Then
        Assert.assertEquals("Publishing on Twitter",janSharing);

    }

}
