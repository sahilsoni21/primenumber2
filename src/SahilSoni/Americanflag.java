package SahilSoni;

import java.util.Scanner;

public class Americanflag {

        public static void main(String[] args) {

            int start=5;
            int end=5;
            for (int i=0;i<5;i++){
                for (int j=1;j<=9;j++){
                    if (j>= start && j<= end) {
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                start--;
                end++;
                System.out.println(" ");
            }
        }
    }