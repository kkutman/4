package java8.services;

import java8.classes.Person;
import java8.classes.WhatSappUser;

import java.util.List;

public interface WhatsappUzerAble {

    String greateWhatsappAccount(WhatSappUser whatsappUzers, List<Person>people);
    List<WhatSappUser>getWhatsappUzer();
    WhatSappUser getProfil(String pasword, List<WhatSappUser>whatsappUzers);
    String getMAssege(String password, String name, List<String> massege, List<WhatSappUser>uzers, List<WhatSappUser>uzers2);

}
