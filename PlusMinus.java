package lv1;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result4 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        double bunmo = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 1) {
                positive++;
            } else if (arr.get(i) == 0) {
                zeros++;
            } else {
                negative++;
            }
            bunmo++;
        }
        
        System.out.println(positive / bunmo);
        System.out.println(negative / bunmo);
        System.out.println(zeros / bunmo);
    }

}

public class PlusMinus{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result4.plusMinus(arr);

        bufferedReader.close();
    }
}