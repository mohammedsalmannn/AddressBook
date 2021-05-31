 package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.TelRec;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact implements Address {
    private ArrayList<String> telphoneRecords = new ArrayList<String>();
    public  static TelRec t = new TelRec();
    Scanner input = new Scanner(System.in);

    String name = input.nextLine();

    public Contact() {

        String MenuOption;
        do {

            System.out.println("1 Add Record");
            System.out.println("2 Delete");
            System.out.println("3 Edit");
            System.out.println("4 Exit");
            MenuOption = input.nextLine();
            if (MenuOption.equals("1")) {
                addRecord();
            }
            else if (MenuOption.equals("2")){
                deleteRecord();
            }
            else if (MenuOption.equals("3")){
                editRecord();
            }
            else System.out.println("enter the value option ");
        } while (!MenuOption.equals("4"));

    }
    @Override
    public void addRecord() {
        System.out.println("Enter Frist  Name");
        t.setFristName(input.nextLine());
        //telphoneRecords.add(FristName);
        System.out.println("Enter Last  Name");
        t.setLastName(input.nextLine());
        //telphoneRecords.add(LastName);
        System.out.println("Enter Address  Name");
        t.setAddress(input.nextLine());
        //telphoneRecords.add(Address);
        System.out.println("Enter City  Name");
        t.setCity(input.nextLine());
        //telphoneRecords.add(City);
        System.out.println("Enter Email  Name");
        t.setEmail(input.nextLine());
        telphoneRecords.add(input.nextLine());
        //System.out.println(telphoneRecords);
        telphoneRecords.add(String.valueOf(t));
        System.out.println(telphoneRecords);
    }
    @Override
    public void editRecord() {
        TelRec t = new TelRec();
        System.out.println("Enter the Email");
        String email = input.nextLine();
        for (int i = 0; i < telphoneRecords.size(); i++) {
            if (telphoneRecords.get(i).equals(email)) {
                System.out.println("sasa");


                System.out.println("1 To Chage Frist Name");
                System.out.println("2 To Chage last Name");
                System.out.println("3 To Chage city Email");
                System.out.println("4 To Chage city Phone");
                int choice = Integer.valueOf(input.nextLine());
                switch (choice) {
                    case 1:
                        //t.setFristName(input.nextLine());
                        //telphoneRecords.add(String.valueOf(t));
                        telphoneRecords.remove(1);
                        telphoneRecords.add(t.setFristName(input.nextLine()));
                        break;
                    case 2:
                        t.setLastName(input.nextLine());
                        telphoneRecords.add(String.valueOf(t));
                        break;
                    case 3:
                        t.setEmail(input.nextLine());
                        telphoneRecords.add(String.valueOf(t));
                    case 4:
                        t.setEmail(input.nextLine());
                        telphoneRecords.add(String.valueOf(t));
                        break;
                    default:
                        System.out.println("Enter tge valid choies");
                        break;


                }
                telphoneRecords.add(String.valueOf(i));
                System.out.println(telphoneRecords);
                break;
            }
        }

    }

    @Override
    public void deleteRecord() {
        TelRec t = new TelRec();
        System.out.println("Enter the email id to delete : ");
        String email = input.next();
        for (int i = 0; i < telphoneRecords.size(); i++) {
            if (telphoneRecords.get(i).equals(email)) {
                System.out.println("Please provide valid email id");
                break;
            }
            telphoneRecords.remove(t);
            System.out.println(telphoneRecords);
        }
    }
}

