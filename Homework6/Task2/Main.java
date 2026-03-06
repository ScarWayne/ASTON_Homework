/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. 
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать 
номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов 
(в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
*/

package Homework6.Task2;

public class Main {

    public static void main(String[] args) {
        
        CreatePhoneCollection.createPhoneBook();

        CreatePhoneCollection.addPhone("Sidorov", "89999999996");

        CreatePhoneCollection.getPhone("Ivanov");
        
    }
    
}
