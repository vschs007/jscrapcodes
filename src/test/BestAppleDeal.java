package test;

import java.util.Scanner;

public class BestAppleDeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Weight of smaller box: ");
        double wsb = sc.nextDouble();
        System.out.printf("Enter Price of smaller box: ");
        double psb = sc.nextDouble();
        //input for larger box starts

        System.out.printf("Enter Weight of bigger box: ");
        double wbb = sc.nextDouble();
        System.out.printf("Enter Price of bigger box: ");
        double pbb = sc.nextDouble();

        double ValofSmallerBox = wsb*psb;
        double ValofBiggerBox = wbb*pbb;

        if(ValofBiggerBox<ValofSmallerBox){              //condition checks
            System.out.println("Smaller box has greater value");
        }
        else  if (ValofBiggerBox>ValofSmallerBox){
            System.out.println("Bigger box has greater value");
        }
        else{
            System.out.println("Values are equal");
        }

    }
}
