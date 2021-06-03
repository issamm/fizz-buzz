package com.issam.fizzbuzz;

public class App {

    public static void main(String[] args){
        new FizzBuzzPrinter(Constants.START_AT, Constants.END_AT, System.out::println)
                .iterateAndPrint();
    }

}
