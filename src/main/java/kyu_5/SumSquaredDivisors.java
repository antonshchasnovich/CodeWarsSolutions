package kyu_5;

import java.util.ArrayList;

/*
Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764. The sum of
the squared divisors is 2500 which is 50 * 50, a square!

Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors is itself
a square. 42 is such a number.

The result will be an array of arrays or of tuples (in C an array of Pair) or a string, each subarray having two elements,
first the number whose squared divisors is a square and then the sum of the squared divisors.

#Examples:

list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
list_squared(42, 250) --> [[42, 2500], [246, 84100]]
 */

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        ArrayList<ArrayList<Long>> result = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            long sumSquaredDiv = 0;
            for (long l = 1; l <= i; l++) {
                if (i % l == 0) {
                    sumSquaredDiv += l * l;
                }
            }
            long sqrt = (long) Math.sqrt(sumSquaredDiv);
            if (sqrt * sqrt == sumSquaredDiv) {
                ArrayList<Long> resultElement = new ArrayList<>();
                resultElement.add(i);
                resultElement.add(sumSquaredDiv);
                result.add(resultElement);
            }
        }
        return result.toString();
    }
}
