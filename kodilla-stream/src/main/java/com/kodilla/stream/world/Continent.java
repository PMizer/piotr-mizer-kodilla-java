package com.kodilla.stream.world;

import java.util.List;



public final class Continent {
    private final String name;

    private final List<Country> countriesList;

    public Continent(final String name, final List<Country> countriesList){
        this.countriesList = countriesList;
        this.name = name;
    }

    public List<Country> getCountriesList(){
        return countriesList;
           }

    public String getName() {
        return name;
    }
}

