package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        Library library = new Library("Aleksandria");
        library.getBooks().add(new Book("Diuna", "Andrew", LocalDate.of(1900,5,5)));
        library.getBooks().add(new Book("Potop", "John", LocalDate.of(1940,5,5)));
        library.getBooks().add(new Book("Costam", "George", LocalDate.of(2010,5,5)));

        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Aleksandria Copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary= null;

        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Aleksandria Copy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //when

        deepClonedLibrary.getBooks().add(new Book("Czysty Kod", "John", LocalDate.of(2018,1,1)));

        //then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(library.getBooks().size(), 3);
        Assert.assertEquals(clonedLibrary.getBooks().size(), 3);
        Assert.assertEquals(deepClonedLibrary.getBooks().size(), 4);
        Assert.assertNotEquals(deepClonedLibrary,clonedLibrary);

    }
}
