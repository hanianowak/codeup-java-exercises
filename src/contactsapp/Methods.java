package contactsapp;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Methods {

    public static void showAll() {
        try {
            String heading1 = "Name";
            String heading2 = "Phone Number";

            System.out.printf("%-10s %10s %n", heading1, heading2);

            System.out.println("------------------------");
            List<String> contacts = Files.readAllLines(Paths.get("src/contactsapp/contacts.txt"));
//            for (String line : contacts) {
//                System.out.println(line);
//                String[] cos = line.split(" \\| ");
//                for (String a : cos) {
//                    System.out.println(a);
//                }
//                System.out.println();
//            }
            for (String line : contacts) {
                System.out.println(line);
            }
            System.out.println();


        } catch (IOException e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }
    }


    public static void addContact() {
        Scanner scan = new Scanner(System.in);
        Path p = Paths.get("src/contactsapp", "contacts.txt");

        String nameAdd;
        long numberAdd;

        System.out.println("Enter the name");
        nameAdd = scan.nextLine();
        System.out.println("Enter the number");
        numberAdd = scan.nextLong();

        List<String> contacts = new ArrayList<>();
        contacts.add(nameAdd + " | " + numberAdd);

        System.out.println("Contact has been added!");
        System.out.println();

        try {
            Files.write(p, contacts, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void searchContacts() {
        Scanner scan1 = new Scanner(System.in);
        String input2;
        System.out.println("Enter the contact you are looking for: ");
        input2 = scan1.nextLine();
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/contactsapp/contacts.txt"));
            for (String line : lines) {
                if (line.toLowerCase().contains(input2.toLowerCase())) {
                    System.out.println(line);
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }


    public static void deleteContact() {
        Path p = Paths.get("src/contactsapp", "contacts.txt");

        Scanner scan = new Scanner(System.in);
        System.out.println("Which contact would you like to delete?");
        String contactToDelete = scan.nextLine();
        try {
            List<String> nowe = new ArrayList<>();
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {
                if (!line.toLowerCase().contains(contactToDelete.toLowerCase())) {
                    nowe.add(line);
                }
            }
            Files.write(p, nowe, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("That contact has been deleted!");
            System.out.println();

        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
