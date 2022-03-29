package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result5 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            
            for(int q = 0; q < i; q++) {
                System.out.print("#");
            }
            
            System.out.println();
        }
    }
/*
n=6

00000# 5 n-1   # 1
0000## 4 n-2   # 2
000### 3 n-3   # 3
00#### 2 n-4   # 4
0##### 1 n-5   # 5
###### 0 n-6   # 6
*/
}

public class Staircase{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result5.staircase(n);

        bufferedReader.close();
    }
}