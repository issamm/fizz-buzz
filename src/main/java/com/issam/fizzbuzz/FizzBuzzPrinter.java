package com.issam.fizzbuzz;

import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * FizzBuzz loop and printer.
 */
@RequiredArgsConstructor
public class FizzBuzzPrinter {

    private final int startAt;
    private final int endAt;
    private final Consumer resultTreatment;

    public void iterateAndPrint(){
        IntStream.range(startAt, endAt + 1)
                .mapToObj(count -> {
                    if(isNumberMultipleOf(count, Constants.THREE)
                            && isNumberMultipleOf(count, Constants.FIVE)){
                        return Constants.FIZZBUZZ;
                    }
                    if(isNumberMultipleOf(count, Constants.THREE)){
                        return Constants.FIZZ;
                    }
                    if(isNumberMultipleOf(count, Constants.FIVE)){
                        return Constants.BUZZ;
                    }
                    return count;
                })
                .forEach(resultTreatment);
    }

    private static boolean isNumberMultipleOf(int number, int multipleOf){
        return number % multipleOf == 0;
    }
}
