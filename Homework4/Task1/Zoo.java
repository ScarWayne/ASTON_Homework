package Homework4.Task1;

public class Zoo {

    private static Animal[] animals = new Animal[20];

    private static Dog[] dogs = new Dog[10];

    private static Cat[] cats = new Cat[10];

    private static int count = 0;
    private static int countDogs = 0;
    private static int countCats = 0;
    
    static void addToAnimals(Animal animal) {
        
        if(count < animals.length) {
            
            animals[count] = animal;
                    
            if(animal instanceof Dog) {

                dogs[countDogs] = (Dog) animal;
                countDogs++;

            } else {

                cats[countCats] = (Cat) animal;
                countCats++;

            }
            
            count++;
        }
    }

    static void printCount() {

        System.out.println("Количество животных: " + count);
        System.out.println("Количество песелей: " + countDogs);
        System.out.println("Количество котиков: " + countCats);

    }


    static void info() {

        for(int i = 0; i < count; i++) {

                animals[i].getName();
                animals[i].printDistance();

                if(animals[i] instanceof Cat) {

                    Cat cat = (Cat) animals[i];
                    System.out.println(cat.getSatiety());
                }
        }
}
    
    public static void feedCats(int quantityFoodInBowl) {

    for (Cat c : cats) {

        c.checkSatiety(quantityFoodInBowl);

    }
}
    
}
