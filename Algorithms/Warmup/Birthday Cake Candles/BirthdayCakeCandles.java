//https://www.hackerrank.com/challenges/birthday-cake-candles


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int totalMax = 0;
        for(int i = 0; i < n; i++){
            int temp = in.nextInt();
            if (temp>max) {
                max = temp;
                totalMax = 1;
            } else if (temp==max) {
                totalMax++;
            }
            
        }
        System.out.println(totalMax);
    }
}