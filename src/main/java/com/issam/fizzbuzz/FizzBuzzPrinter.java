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

    /**
     * Iterate on the range and transform the multiple of 3 by "Fizz",
     * the multiple of 5 by "Buzz", and multiple of 3 AND multiple of 5 by "FizzBuzz".
     */
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

    /**
     * @param number Number to check
     * @param multipleOf "Multiple of" number param
     * @return True if the number to check is the multiple of the given param
     */
    private static boolean isNumberMultipleOf(int number, int multipleOf){
        return number % multipleOf == 0;
    }
}
