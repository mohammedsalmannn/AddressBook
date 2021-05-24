package com.bridgelabz.com.bridgelabz;
import java.util.Scanner;
public class TelRec {
    TelephoneDirectory contact;
    private  String FristName;
    private String LastName;
    private String Address;
    private String City;
    private String State;
    private String Zip;
    private String Phone;

    public String getFristName() {
        return FristName;
    }

    public void setFristName(String fristName) {
        this.FristName = fristName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    private String Email;



    @Override
    public String toString() {
        return "ContactDetails{" +
                "firstName='" + FristName + '\'' +
                ", lastName='" +LastName + '\'' +
                ", address='" + Address + '\'' +
                ", city='" + City + '\'' +
                ", state='" + State+ '\'' +
                ", zip=" + Zip +
                ", phoneNumber='" + Phone + '\'' +
                ", emailId='" + Email + '\'' +
                '}';
}
}