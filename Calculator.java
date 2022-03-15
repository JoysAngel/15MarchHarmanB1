package com.harman.project1;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
    Addition addObj=new Addition();
    Subtraction subObj=new Subtraction();
    Integer x,y,addResult,subResult;
    Scanner input =new Scanner(System.in);
    System.out.println("Enter num1");
    x=input.nextInt();
    System.out.println("Enter num2");
    y=input.nextInt();
    addResult=addObj.Add2Numbers(x,y);
    System.out.println(addResult);
    subResult=subObj.SubOperation(x,y);
    System.out.println(subResult);

    }
}
