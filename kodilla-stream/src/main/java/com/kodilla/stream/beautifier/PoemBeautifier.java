package com.kodilla.stream.beautifier;


public class PoemBeautifier {
    public void beautify(String poem, PoemDecorator decorate){
        String result = decorate.decorate(poem);
        System.out.println("Your new beautiful poem: "+result);
    }
}
