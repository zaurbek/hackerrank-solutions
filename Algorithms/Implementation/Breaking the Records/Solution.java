//https://www.hackerrank.com/challenges/breaking-best-and-worst-records


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int max = Integer.MIN_VALUE;
        int maxCounter = -1;
        int min = Integer.MAX_VALUE;
        int minCounter = -1;
        for (int i =0;i<s.length;i++) {
            if (s[i]>max) {
                max = s[i];
                maxCounter++;
            }
            if (s[i]<min) {
                min = s[i];
                minCounter++;
            }
        }
        return new int[] {maxCounter,minCounter};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
