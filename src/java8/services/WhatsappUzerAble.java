package java8.services;

import java8.classes.Person;
import java8.classes.WhatsappUzer;

import java.util.List;

public interface WhatsappUzerAble {

    String greateWhatsappAccount( WhatsappUzer whatsappUzers,List<Person>people);
    List<WhatsappUzer>getWhatsappUzer();
    WhatsappUzer getProfil(String pasword,List<WhatsappUzer>whatsappUzers);
    String getMAssege(String password,String name,String massege,List<WhatsappUzer>uzers,List<WhatsappUzer>uzers2);

}
