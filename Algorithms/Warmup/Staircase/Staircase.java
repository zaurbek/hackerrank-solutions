//https://www.hackerrank.com/challenges/staircase?h_r=next-challenge&h_v=zen

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String symbols = "";
        for (int i =0;i<n;i++) {
            symbols +="#";
            System.out.printf("%"+n+"s%n",symbols);
        }
    }
}