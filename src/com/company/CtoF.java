package com.company;

import java.util.Scanner;

public class CtoF {

    public static void main(String[] args) {
        // Create new Scanner object

        Scanner sc=new Scanner(System.in);
        double f=0;
        boolean flag=true;
        do{

            try{
                System.out.println("Enter Farenheit value:");
                String input=sc.nextLine();
                f=Double.parseDouble(input);
                flag=false;
            }
            catch(Exception e)
            {System.out.println("Invalid input. Plese enter value correctly.");}
        }while(flag);
        System.out.println("Celcius :"+(5.0/9*(f-32)));
    }
}




