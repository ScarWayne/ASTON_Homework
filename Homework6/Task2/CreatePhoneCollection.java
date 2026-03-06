package Homework6.Task2;

import java.util.Map;
import java.util.HashMap;

public class CreatePhoneCollection {

    private static Map<String, String> phones = new HashMap<>();

    public static Map<String, String> createPhoneBook() {
      
        Phones phone1 = new Phones("Ivanov", "89999999999");
        Phones phone2 = new Phones("Petrov", "89999999998");
        Phones phone3 = new Phones("Ivanov", "89999999997");

        phones.put(phone1.getNumber(), phone1.getName());
        phones.put(phone2.getNumber(), phone2.getName());
        phones.put(phone3.getNumber(), phone3.getName());

        return phones;

    }

    
    public static void addPhone(String lastName, String phoneNumber) {
 
        Phones phone = new Phones(lastName, phoneNumber);

        phones.put(phone.getNumber(), phone.getName());

    }

    public static void getPhone(String lastName) {

        System.out.println("Фамилия: " + lastName);

        boolean found = false;

        
        for (Map.Entry<String, String> phone : phones.entrySet()) {

            if (phone.getValue().equalsIgnoreCase(lastName)) {

                System.out.println("телефон: " + phone.getKey());
                found = true;

            }
        }
        if (!found) {
            System.out.println("Пользователь не найден.");
        }
    }

}
    

