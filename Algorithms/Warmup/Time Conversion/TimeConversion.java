//https://www.hackerrank.com/challenges/time-conversion

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String timeType = s.substring(8);
        if (timeType.equals("PM")) {
            if (s.substring(0,2).equals("12")) {
                return "12"+s.substring(2,8);
            } else {
                return (Integer.parseInt(s.substring(0,2))+12)+s.substring(2,8);    
            }
            
        } else {
            if (s.substring(0,2).equals("12")) {
                return "00"+s.substring(2,8);
            } else {
                return s.substring(0,8);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}