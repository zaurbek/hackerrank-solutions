//https://www.hackerrank.com/challenges/kangaroo


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1<v2) {
            return "NO";
        }
        else {
            boolean meet = false;
            int i =0;
            while(!meet&&i<10000) {
                if (x1+v1*i==x2+v2*i) {
                    meet=true;
                }
                i++;
            }
            return meet?"YES":"NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}