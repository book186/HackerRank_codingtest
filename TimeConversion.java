package lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result8 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String inputStr[] = s.split(":");
        int hour = Integer.parseInt(inputStr[0]);
        String minute = inputStr[1];
        String second = inputStr[2].substring(0, 2);
        String midnight = inputStr[2].substring(2);
        String outputHour = "";
        String outputStr = "";
        
        if ("PM".equals(midnight) && hour < 12){
            hour += 12;
            outputHour = Integer.toString(hour);
        } else if("AM".equals(midnight) && hour == 12) {
            outputHour = "00";
        } else if("AM".equals(midnight)) {
            outputHour = "0" + Integer.toString(hour);
        } else {
            outputHour = Integer.toString(hour);
        }
        
        outputStr = outputHour + ":" + minute + ":" + second;
        
        return outputStr;
    }

}

public class TimeConversion{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result8.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}