package com.issam.fizzbuzz;

import org.junit.Test;

import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;

public class FizzBuzzPrinterTest {

    private final static String OUTPUT_OF_0_TO_19 = "FizzBuzz,1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19";

    private final static String OUTPUT_OF_15_TO_20 = "FizzBuzz,16,17,Fizz,19,Buzz";


    @Test
    public void testFizzBuzzPrinter_withIncorrectRange_assertIsEmpty(){
        StringBuilder stringBuilder = new StringBuilder();
        Consumer stringBuilderAppender = result -> {
            if(stringBuilder.length() > 0){
                stringBuilder.append(",");
            }
            stringBuilder.append(result);
        };
        new FizzBuzzPrinter(2000, 0, stringBuilderAppender).iterateAndPrint();
        assertEquals("", stringBuilder.toString());
    }

    @Test
    public void testFizzBuzzPrinter_withEmptyRange_assertIsFizzBuzz(){
        StringBuilder stringBuilder = new StringBuilder();
        new FizzBuzzPrinter(0, 0, result -> {
            if(stringBuilder.length() > 0){
                stringBuilder.append(",");
            }
            stringBuilder.append(result);
        }).iterateAndPrint();
        assertEquals("FizzBuzz", stringBuilder.toString());
    }

    @Test
    public void testFizzBuzzPrinter_to19(){
        StringBuilder stringBuilder = new StringBuilder();
        new FizzBuzzPrinter(15, 20, result -> {
            if(stringBuilder.length() > 0){
                stringBuilder.append(",");
            }
            stringBuilder.append(result);
        }).iterateAndPrint();
        assertEquals(OUTPUT_OF_15_TO_20, stringBuilder.toString());
    }


}
