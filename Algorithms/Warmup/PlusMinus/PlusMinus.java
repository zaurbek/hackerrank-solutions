//https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = 0;
        int p = 0;
        int neg =0;
        int z = 0;
        for (int i =0; i<n; i++) {
            temp = in.nextInt();
            if (temp==0) {
                z++;
            }
            if (temp>0) {
                p++;
            }
            if (temp<0) {
                neg++;
            }
        }
        System.out.printf("%.6f%n",(double)p/n);
        System.out.printf("%.6f%n",(double)neg/n);
        System.out.printf("%.6f%n",(double)z/n);
    }
}
