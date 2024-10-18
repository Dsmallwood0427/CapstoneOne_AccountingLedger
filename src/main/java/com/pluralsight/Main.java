package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.util.random.RandomGeneratorFactory.all;


public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);
    static ArrayList<Transaction> ledger = new ArrayList<>();

    public static void main(String[] args) {
        loadTransactionFromFile();

// Initialize the command variable (int mainMenuCommand;)
        int mainMenuCommand;

        // Import Scanner, create instance of scanner as a class variable
        // Use scanner to store the users command input into a variable ()

        do {
            System.out.println("Home Screen");
            System.out.println("Please enter an option: ");
            System.out.println("D) Add Deposit");
            System.out.println("P) Make a Payment(Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Exit");
            scanner.nextLine();

            try {
                mainMenuCommand = commandScanner.nextInt();
            } catch (InputMismatchException ime) {
//                ime.printStackTrace();
                mainMenuCommand = 0;
            }

                switch (mainMenuCommand) {
                    case 1:
                        addDeposits();
                        break;
                    case 2:
                        makePayment();
                        break;
                    case 3:
                        displaySubMenu();
                        break;
                    case 0:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Invalid option, try again.");

                }
            }
            while (mainMenuCommand != 0) ;


        }

        public static void loadTransactionFromFile () {

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("transactions.csv"));

                String firstLine = bufferedReader.readLine();
                String input;
            }

        }

        private static void addDeposits(){
            System.out.println("Enter date YYYY-MM-DD:");
            String date = inputScanner.nextLine();

            System.out.println("Enter description:");
            String description = inputScanner.nextLine();

            System.out.println("Enter vendor:");
            String vendor = inputScanner.nextLine();

            System.out.println("Enter amount:");
            float amount = inputScanner.nextDouble();
        }


        private static void makePayment() {


        }

        int submenucommand;

        private static void subMenuCommand() {
            do {
                System.out.println("Ledger Screen");
                System.out.println("Please enter an option: ");
                System.out.println("A) All");
                System.out.println("D) Deposits");
                System.out.println("P) Payments");
                System.out.println("R) Reports");
                System.out.println("H) Home");

                System.out.println("0) Back");
                System.out.print("Command: ");

                try {
                    subMenuCommand(); = commandScanner.nextInt();
                } catch (InputMismatchException ime) {
//                ime.printStackTrace();
                    subMenuCommand();= 0;
                }

                switch (subMenuCommand();) {
                    case 1:
                        all()
                        break;
                    case 2:
                        deposits();
                        break;
                    case 3:
                        payments();
                        break;
                    case 4:
                        reports();
                        break;
                    case 0:
                        System.out.println("Home");
                        break;
                    default:
                        System.out.println("Invalid option, try again.");

                }
            } while (subMenuCommand != 0);

        }

        private static void all() {
            System.out.println("Placeholder: Display all entries");
        }

        private static void deposits() {
            System.out.println("Display only the entries that are deposits into the account");
        }

        private static void payments() {
            System.out.println("Display only the negative entries");
            float amount = inputScanner.nextFloat();
        }

        private static void reports() {
            do {
                System.out.println("Reports Screen");
                System.out.println("Please select an option: ");
                System.out.println("1) Month To Date");
                System.out.println("2) Previous Month");
                System.out.println("3) Year To Date");
                System.out.println("4) Previous Year");
                System.out.println("5) Search by Vendor");
                System.out.println("0) Back");
                 = scanner.nextInt();
                scanner.nextLine();

                switch () {
                    case 1:
                        MonthToDate();
                        break;
                    case 2:
                        PreviousMonth();
                        break;
                    case 3:
                        YearToDate();
                        break;
                    case 4:
                        PreviousYear();
                        break;
                    case 5:
                        searchByVendor();
                    case 0:
                        System.out.println("Back");
                        break;
                    default:
                        System.out.println("Go back and try again.");
                }
            } while(reports(); != 0);


        }

        private static void MonthToDate() {
            System.out.println("Placeholder: Reports from Month to Date");
        }

        private static void PreviousMonth() {
            System.out.println("Placeholder: Reports from the previous months");
        }

        private static void YearToDate() {
            System.out.println("Placeholder: Reports from Year to Date");
        }

        private static void PreviousYear() {
            System.out.println("Placeholder: Reports from the previous year");
        }

        private static void searchByVendor() {
            System.out.println("What is vendor's name?");
        }
    }



