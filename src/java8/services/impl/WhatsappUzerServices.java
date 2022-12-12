package java8.services.impl;

import java8.classes.Person;
import java8.classes.WhatsappUzer;
import java8.services.WhatsappUzerAble;

import java.util.ArrayList;
import java.util.List;

public class WhatsappUzerServices implements WhatsappUzerAble {
    List<WhatsappUzer>whatsappUzers = new ArrayList<>();
    List<String>whatsappMassege = new ArrayList<>();

    @Override
    public String greateWhatsappAccount(WhatsappUzer whatsappUzer, List<Person>people) {
        if (whatsappUzer.getId()!=0){
            this.whatsappUzers.add(whatsappUzer);
            return "УСПЕШНО!!!";
        }else {
            return "АКАУНТ НЕ СОЗДАН!!!";
        }


    }

    @Override
    public List<WhatsappUzer> getWhatsappUzer() {
        return this.whatsappUzers;
    }

    @Override
    public WhatsappUzer getProfil(String pasword,List<WhatsappUzer> whatsappUzers) {
        for (WhatsappUzer whatsappUzer : whatsappUzers) {
            if(whatsappUzer.getPassword().equals(pasword)){
                return whatsappUzer;
            }
        }
        return null;
    }

    @Override
    public String getMAssege(String password,String name,List<String> massege, List<WhatsappUzer> uzers,List<WhatsappUzer>uzers2) {
        for (WhatsappUzer uzer : uzers) {

            for (WhatsappUzer whatsappUzer : uzers2) {
                if (uzer.getPassword().equals(password)) {
                    if (whatsappUzer.getUzerName().equals(name)) {
                        whatsappMassege.add(uzer.getUzerName()+" : "+massege);

                        whatsappUzer.setMassege((ArrayList<String>) this.whatsappMassege);
                        return "СОБШЕННИЕ ОТПРАВЛЕННО!!";

                    }

            }
            }
        }
        return null;
    }
}
