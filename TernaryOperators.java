package com.keyword;

import java.util.Scanner;

public class TernaryOperators
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Age: ");
        Scanner in =new Scanner(System.in);
        int Age = in.nextInt();
        System.out.print((Age>=18)?"Eligible to Vote":"Not Eligible to Vote");
    }
}
