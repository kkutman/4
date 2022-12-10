import java8.classes.Person;
import java8.classes.WhatsappUzer;
import java8.enums.Countri;
import java8.enums.Gender;
import java8.enums.WhatsappStatus;
import java8.services.impl.PersonServicesImpl;
import java8.services.impl.WhatsappUzerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person>peoples = new ArrayList<>();
        List<WhatsappUzer>whatsappUzers = new ArrayList<>();
        PersonServicesImpl personServices = new PersonServicesImpl();
        WhatsappUzerServices whatsappUzerServices = new WhatsappUzerServices();
        while (true){

            System.out.println("PRESS 1 CREATE PASSPORT!");
            System.out.println("PRESS 2 GET ALL PASPORT!");
            System.out.println("PRESS 3 CREATE WHATSAPP ACCOUNT!");
            System.out.println("PRESS 4 GET ALL WHATSAPP ACCOUNT!");
            System.out.println("PRESS 5 GET WHATSAPP PROFIL!");
            System.out.println("PRESS 6 GET PERSON FIRST NAME!");
            System.out.println("PRESS 7 GET MASSEGE!");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    String n1 = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName = scanner.nextLine();
                    System.out.print("LAST NAME : ");
                    String lastName = scanner.nextLine();
                    System.out.print("DATE OF BIRTH-(XXXX-XX-XX) : ");
                    String dateOfBirt = scanner.nextLine();
                    System.out.println(personServices.greate(new Person(id,firstName,lastName,dateOfBirt,Countri.BISHKEK, Gender.MALE)));
                    break;
                case 2:
                    System.out.println(personServices.getPerson());
                    break;
                case 3:
                    System.out.print("ID : ");
                    int id2 = scanner.nextInt();
                    String n11 = scanner.nextLine();
                    System.out.print("UZER NAME : ");
                    String whatsappName = scanner.nextLine();
                    System.out.print("PHONE NUMBER :1 ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("PASWORD : ");
                    String password = scanner.nextLine();
                    System.out.println(whatsappUzerServices.greateWhatsappAccount(new WhatsappUzer(id2,
                            phoneNumber, whatsappName, WhatsappStatus.WWWW,password,personServices.getPerson()),peoples));
                    break;
                case 4:
                    System.out.println(whatsappUzerServices.getWhatsappUzer());
                    break;
                case 5:
                    String nnn = scanner.nextLine();
                    System.out.print("PASSWORD : ");
                    String password2 = scanner.nextLine();
                    System.out.println(whatsappUzerServices.getProfil(password2, whatsappUzerServices.getWhatsappUzer()));
                    break;
                case 6:
                    String nm = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName2 = scanner.nextLine();
                    System.out.println(personServices.getPersonFirsName(firstName2, personServices.getPerson()));
                    break;
                case 7:
                    String nn5 = scanner.nextLine();
                    System.out.print("PASSWORD : ");
                    String password4 = scanner.nextLine();
                    System.out.print("UZER NAME : ");
                    String uz = scanner.nextLine();
                    System.out.print("MASSEGE : ");
                    String massege = scanner.nextLine();
                    System.out.println(whatsappUzerServices.getMAssege(password4, uz, massege, whatsappUzerServices.getWhatsappUzer(),whatsappUzerServices.getWhatsappUzer()));


            }

        }



    }
}