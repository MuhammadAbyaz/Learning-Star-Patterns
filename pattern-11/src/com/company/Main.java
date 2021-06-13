
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=0;
        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i<=rows; i++){
            if (rows % 2 ==0){
                if (i<=rows/2){
                    k++;
                }
                if (i>rows/2 +1){
                    k--;
                }
            }
            else {
                if (i <= (rows + 1) / 2) {
                    k++;
                } else {
                    k--;
                }
            }
            for(int j= 1; j<=(rows+1); j++){
                if(j<=k){
                    System.out.print("*");
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}