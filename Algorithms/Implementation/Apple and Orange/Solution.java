//https://www.hackerrank.com/challenges/apple-and-orange

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int houseApple = 0;
        int houseOrange = 0;
        for (int i = 0; i<m;i++) {
            int temp1 = in.nextInt();
            if ((a+temp1)<=t&&(a+temp1)>=s) {
                houseApple++;
            }
        }
        for (int i = 0; i<n;i++) {
            int temp2 = in.nextInt();
            if ((b+temp2)<=t&&(b+temp2)>=s) {
                houseOrange++;
            }
        }
        System.out.printf("%d%n%d",houseApple,houseOrange);
    }
}