package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(duplicateCharacterChecker(str));

    }
    public static String duplicateCharacterChecker(String str){
        if(str.length() == 0){
            return "";
        }
        int count = str.length() - str.replace(str.substring(0,1), "").length();
        System.out.println("The character "+str.charAt(0)+": occurred "+count+" times");
        return duplicateCharacterChecker(str.replace(str.substring(0,1), ""));
    }
}
