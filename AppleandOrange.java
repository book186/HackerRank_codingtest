package lv1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result10 {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        /*
            s: integer, starting point of Sam's house location.                                    7
            t: integer, ending location of Sam's house location.                                11
            a: integer, location of the Apple tree.                                                5
            b: integer, location of the Orange tree.                                            15
            apples: integer array, distances at which each apple falls from the tree.            [-2, 2, 1]
            oranges: integer array, distances at which each orange falls from the tree.            [5, -6]
            
            apple tree                                orange tree
                 5               7      11                 15
            
apple         3     6            7                                                     1
orange                                  9                          20                  1
        */
        int fallAppleNum = 0;
        int fallOrangeNum = 0;
        
        for (int i = 0; i < apples.size(); i++) {
            if (s <= a + apples.get(i) && a + apples.get(i) <= t) {
                fallAppleNum++;
            }
        }
        
        for (int i = 0; i < oranges.size(); i++) {
            if (s <= b + oranges.get(i) && b + oranges.get(i) <= t) {
                fallOrangeNum++;
            }
        }
        
        System.out.println(fallAppleNum);
        System.out.println(fallOrangeNum);
    }

}

public class AppleandOrange{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result10.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}