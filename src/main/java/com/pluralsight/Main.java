package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);
    static ArrayList<Transaction> = allTransaction = new ArrayList<>();

    public static void main(String[] args) {
        loadTransactionFromFile();

// Initialize the command variable (int mainMenuCommand;)
        int mainMenuCommand;

        // Create a do-while loop with a conditional for the command=
        do {
            // Display the menu, sout
            System.out.println("Please enter an option: ");
            System.out.println("D) Add Deposit");
            System.out.println("P) Make a Payment(Debit)");
            System.out.println("L) Ledger");
            System.out.print("X) Exit");

    }








}