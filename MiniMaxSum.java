package lv1;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result6 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long total = 0;
        long min = arr.get(0);
        long max = arr.get(0);
        
        //long min = Collections.min(arr);
        //long max = Collections.max(arr);
        
        for(int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }
        
        for(int i = 1; i < arr.size(); i++) {
            if(min > arr.get(i)) {
                min = arr.get(i);
            } else if(max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        
        System.out.println((total-max) + " " + (total-min));
    }

}

public class MiniMaxSum{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result6.miniMaxSum(arr);

        bufferedReader.close();
    }
}