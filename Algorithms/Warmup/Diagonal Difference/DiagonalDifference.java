//https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int n = Integer.parseInt(in.nextLine());
        String[] arr = new String[n];
        for (int i=0; in.hasNextLine(); i++) {
            arr = in.nextLine().split(" ");
            for (int j=0; j<n; j++) {
                if (i==j) {
                    sum1+=Integer.parseInt(arr[j]);
                }
                if ((n-i-1)==j) {
                    sum2+=Integer.parseInt(arr[j]);
                }
            }
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}