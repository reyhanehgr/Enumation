/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        //print value of answer enum
        System.out.format("Values : %s '\n" , Arrays.toString(Answer.values()));
        
        //print value of mycolor enum
        System.out.format("MyColor Values : %s '\n" , Arrays.toString(MyColor.values()));
        
        //get a range (enumset) of mycolor enum
        EnumSet<MyColor> S = EnumSet.range(MyColor.Black, MyColor.Green);
        System.out.println("Values of EnumSet :");
        for (MyColor s:S){
            System.out.format("%s \n", s);
        }
        System.out.println("");
        
        //pars a string into answer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: yes/no:");
        String str = scanner.next();
        Answer A = Answer.valueOf(str); 
        System.out.format("Entry : %s \n", A);
    }
    
}
enum Answer {yes,no}