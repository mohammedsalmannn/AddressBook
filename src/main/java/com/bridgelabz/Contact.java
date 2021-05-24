 package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.TelRec;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private ArrayList<String> telphoneRecords = new ArrayList<String>();
    //ArrayList<TelRec>
    TelRec contact;
    Scanner input = new Scanner(System.in);

    String name = input.nextLine();

    public Contact() {

        String MenuOption;
        do {

            System.out.println("1 Add Record");
            System.out.println("2 Delete");
            System.out.println("3 Exit");
            MenuOption = input.nextLine();
            if (MenuOption.equals("1")) {
                addRecord();
            }
        } while (MenuOption.equals("3"));

    }

    public void addRecord() {
        System.out.println("code will add soon");
        TelRec a1 = new TelRec();
        telphoneRecords = new ArrayList<String>();
        TelRec t = new TelRec();

        System.out.println("Enter Frist  Name");
        String FristName = input.nextLine();
        telphoneRecords.add(FristName);
        System.out.println("Enter Last  Name");
        String LastName = input.nextLine();
        telphoneRecords.add(LastName);
        System.out.println("Enter Address  Name");
        String Address = input.nextLine();
        telphoneRecords.add(Address);
        System.out.println(telphoneRecords);
    }

    private boolean editRecord() {
        System.out.println("Enter the Email");
        String FristName = input.nextLine();
        if (FristName.equals(telphoneRecords.get(Integer.parseInt(FristName)))) {
            return false;
        }
        System.out.println("1 To Chage Frist NAame");
        System.out.println("1 To Chage last NAame");
        System.out.println("1 To Chage city NAame");
        int choice = Integer.valueOf(input.nextLine());
        switch (choice) {
            case 1:
                telphoneRecords.set(Integer.parseInt(FristName), input.nextLine());
                break;
             default:
                System.out.println();
                break;

        }

        return true;
    }

    private void deleteRecord(){
        System.out.println("Enter the email id to delete : ");
        String email = input.next();
        if (!telphoneRecords.equals(email))
        {
            System.out.println("Please provide valid email id");
            telphoneRecords.remove(email);
        }
        telphoneRecords.remove(email);
    }

    }

