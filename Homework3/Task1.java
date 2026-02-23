 /* 1) Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена, состояние бронирования покупателем. 

Конструктор класса должен заполнять эти поля при создании объекта. 

Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
*/

package Homework3;

public class Task1 {

    public static void main(String[] args) {

        Product product1 = new Product(
                "Laptop Asus Vivobook", 
                "12.12.2020", 
                "ASUS", 
                "China", 
                60000.00, 
                "Confirmed"
            );

        Product product2 = new Product(
                "Tablet Xiaomi Mi Pad 6", 
                "10.10.2024", 
                "Xiaomi", 
                "China", 
                20000.00, 
                "Canceled"
            );

        product1.printProductInfo();
        System.out.println();
        product2.printProductInfo();
        
    }
}

    class Product {
        String name;
        String production_date;
        String manufactor;
        String country_of_manufacture;
        double price;
        String booking_status;

            
        Product(String name, String production_date, String manufactor, String country_of_manufacture, double price, String booking_status) {

            this.name = name;
            this.production_date = production_date;
            this.manufactor = manufactor;
            this.country_of_manufacture = country_of_manufacture;
            this.price = price;
            this.booking_status = booking_status;

        }

        @Override
        public String toString() {
            
            return "Название: " + name + 
            ", Дата производства: " + production_date + 
            ", Производитель: " + manufactor + 
            ", Страна производства: " + country_of_manufacture + 
            ", Стоимость: " + price + 
            ",Статус бронирования: " + booking_status;
        }

            

        void printProductInfo() {

            System.out.print(

                "Название продукта: " + name + "\n" + 
                "Дата производства: " + production_date + "\n" +
                "Производитель: " + manufactor +  "\n" +
                "Страна производства: " + country_of_manufacture + "\n" +
                "Стоимость: " + price +  "\n" +
                "Статус бронирования: " + booking_status
            ); 

        }
   
    }

