package java8.classes;

import java8.enums.WhatsappStatus;

import java.util.ArrayList;
import java.util.List;

public class WhatSappUser {
    private int id;
    private String phoneNumber;
    private String userName;
    private WhatsappStatus whatsappStatus;
    private String password;
    private ArrayList<String> massege;

    public WhatSappUser(int id, String phoneNumber, String uzerName, WhatsappStatus whatsappStatus, String password, List<Person> people) {
        for (Person person : people) {
            if (person.getId() == id) {
                this.id = id;
                this.phoneNumber = phoneNumber;
                this.userName = uzerName;
                this.whatsappStatus = whatsappStatus;
                this.password = password;
            } else {

            }
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WhatsappStatus getWhatsappStatus() {
        return whatsappStatus;
    }

    public void setWhatsappStatus(WhatsappStatus whatsappStatus) {
        this.whatsappStatus = whatsappStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getMassege() {
        return massege;
    }

    public void setMassege(ArrayList<String> massege) {
        this.massege = massege;
    }

    @Override
    public String toString() {
        return "\n<<<<<<< WHATSAPP ACCOUNT >>>>>>>>" +
                "\nID : " + id +
                "\nPHONE NUMBER : " + phoneNumber +
                "\nUZER NAME : " + userName +
                "\nWHATSAPP STATUS : " + whatsappStatus +
                "\nPASWORD : " + password +
                "\nMASSEGE : " + massege +
                "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*";
    }
}
