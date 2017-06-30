//https://www.hackerrank.com/challenges/between-two-sets


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int getTotalX(int[] a, int[] b){
        int divisor = 1;
        int answer = 0;
        int result = 0;
            
        while(divisor<=100) {
            int counter1 = 0;
            int counter2 = 0;
            for (int i = 0; i<a.length; i++) {
                if (divisor%a[i]==0) {
                    counter1++;
                }
            }
            if (counter1!=a.length) {
                divisor++;
                continue;
            }
            for (int i = 0; i<b.length; i++) {
                if (b[i]%divisor==0) {
                    counter2++;
                }
            }
            if (counter2==b.length) {
                result++;
                divisor++;
            } else {
                divisor++;
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
