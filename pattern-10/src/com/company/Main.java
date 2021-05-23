package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.print("Enter no of Rows: ");
        rows = sc.nextInt();
        int k = 0 ;
        int n = (rows+1)/2;
        for(int i = 1; i<=rows; i++){
            if(rows%2 == 0)
            {
                if (i<=n){k++;}
                if (i>n+1){k--;}
            }
            else {
                if (i <= n) {
                    k++;
                }else {
                    k--;
                }
            }
            for(int j = 1; j<= rows; j++){
                if(j>=n+1-k &&j<=n-1+k){
                    System.out.print("*");
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}