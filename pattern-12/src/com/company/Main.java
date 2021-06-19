package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<= (2 * rows)-1; j++){
                if(j>=i && j<=(2*rows)-i){
                    System.out.print("*");
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}