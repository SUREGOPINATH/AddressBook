package com.mphasis.main;

import com.mphasis.controller.Controller;

import java.util.Scanner;

/**
 * @author : Sure Gopinath
 * created date : 26th Oct 2020
 * Functionality : Address book is book that store the address of the person
 *
 * */

public class Main {
    /**
     * Functionality : This is Menu function that displays the operation
     *                 Address book
     *
     * */
    public static void mainmenu(){
        System.out.println("welcome to main of addressbook choose an option :");
        System.out.println("""
                1: Create a addressbook\s
                2: Open an existing addressbook\s
                3: Save an addressbook\s
                4: Save an addressbook as\s
                5: Close addressbook
                6: Quit""".indent(1));
        System.out.println("Enter the choice");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        switch (input) {
            case 1 -> Controller.create();
            case 2 -> Controller.Openaddressbook();
            case 3 -> Controller.save();
            case 4 -> Controller.saveAS();
            case 5 -> Controller.close();
            case 6 -> Controller.quit();
        }
    }
    /*Functionality:main method of Main class*/
    public static void main(String[] args) {
        Main.mainmenu();
    }
}
