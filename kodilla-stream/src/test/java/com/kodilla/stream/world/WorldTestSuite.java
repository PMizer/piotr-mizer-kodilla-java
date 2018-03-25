package com.kodilla.stream.world;


import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("1000000"));
        Country spain = new Country("Spain", new BigDecimal("2000000"));
        Country france = new Country("france", new BigDecimal("3000000"));

        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(spain);
        europeCountries.add(france);

        Country china = new Country("China", new BigDecimal("3000000"));
        Country japan = new Country("Japan", new BigDecimal("2000000"));
        Country korea = new Country("Korea", new BigDecimal("1000000"));

        List<Country> asiaCountries = new ArrayList<>();

        asiaCountries.add(china);
        asiaCountries.add(japan);
        asiaCountries.add(korea);

        Continent europe = new Continent("Europe", europeCountries);
        Continent asia = new Continent("Asia", asiaCountries);

        List<Continent> allContinents = new ArrayList<>();
        allContinents.add(europe);
        allContinents.add(asia);

        World world = new World(allContinents);



        //When

        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then

        Assert.assertEquals(new BigDecimal("12000000"),worldPopulation);
    }
}