/*
3)  Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, 
времени их работы и стоимости. 
*/

package Homework3;

public class Task3 {

    public static void main(String[] args) {

        Park park = new Park();
        park.name_park = "Cheburland";
        park.address = "Russia, Moscow, VDNH, Pavilion 120th";
        park.park_opening_hours = "10 a.m - 10 p.m";
        

        Park.Attractions attraction1 = park. new Attractions( "Ferris wheel", 
                                                                    "A Ferris wheel is a large rotating amusement ride with passenger cabins attached around its rim. It slowly turns to lift riders high above the ground, offering panoramic views and a thrilling yet smooth experience.", 
                                                                    "For all. Young children should be with an adult", 
                                                                    10.99, 
                                                                    "11 a.m - 8 p.m");
        
        

        
       
        
        Park.Attractions attraction2 = park. new Attractions(
                                                                    "Roller Coaster",                                                                     "A roller coaster is a high-speed ride with steep drops, sharp turns, and exciting loops. It gives riders a thrilling experience with sudden changes in speed and direction.",
                                                                    "Сhildren older than 7, adult", 
                                                                    15.50, 
                                                                    "10 a.m - 7 p.m");

        Park.Attractions attraction3 = park. new Attractions(
                                                                    "Carousel", 
                                                                    "A carousel is a gentle rotating ride with decorative horses and seats. It moves in a circle while playing cheerful music, making it perfect for families and young children.",
                                                                    "For all. Young children should be with an adult", 
                                                                    7.00, 
                                                                    "10 a.m - 10 p.m");

        park.getInfoAboutPark();

        System.out.println();

        attraction1.getInfoAboutAttractions();

        System.out.println();

        attraction2.getInfoAboutAttractions();

        System.out.println();

        attraction3.getInfoAboutAttractions();

               
     }    

}
        
   

class Park {

        String name_park;
        String address;
        String park_opening_hours;
        Attractions attractions;

    class Attractions{
        String attraction_name;
        String description;
        String acceptable_age;
        double session_cost;
        String attraction_opening_hours;
                    
        Attractions(String attraction_name, String description, String acceptable_age, double session_cost, String attraction_opening_hours) {

            this.attraction_name = attraction_name;
            this.description = description;
            this.acceptable_age = acceptable_age;
            this.session_cost = session_cost;
            this.attraction_opening_hours = attraction_opening_hours;

        }

            void getInfoAboutAttractions(){

                System.out.print(
                                    "Атракционы: " + "\n" +
                                    "Название аттракциона: " + attraction_name + "\n" +
                                    "Описание: " + description + "\n" +
                                    "Разрешенный возраст: " + acceptable_age + "\n" +
                                    "Стоимость проката 1 раз: " + session_cost + "\n" +
                                    "Часы работы аттракциона: " + attraction_opening_hours
                );


            }
    }

    void getInfoAboutPark() {

        System.out.print(
                            "Название парка: " + name_park + "\n" +
                            "Адрес парка: " + address + "\n" +
                            "Часы работы: " + park_opening_hours
        );
    
    }
}
        