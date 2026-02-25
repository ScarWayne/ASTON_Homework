package Homework4.Task1;

class Cat extends Animal{

    private int distanceRunUnreal;
    private boolean satiety = false;
        
    Cat(String name) {
        
        super(name, 200, 0);
        this.satiety = false;
        
    }

    String getSatiety() {

        return "Сытость: " + satiety;

    }

    @Override

    String getName() {

        return "Кот" + name;

    }

    void setDistance(int newDistanceRun, int newDistanceSwim) {

        if(newDistanceRun >= 0 && newDistanceRun <= 200) {

            distanceRun = newDistanceRun;

        } else {

            distanceRunUnreal = newDistanceRun;

        }

        if(newDistanceSwim == 0) {

            distanceSwim = newDistanceSwim;

        }
    }

    void printDistance() {

        if(distanceRunUnreal > 200) {

            System.out.println(name + " пробежал " + distanceRun + " м." + "\n" +
                                "Требуется дозаправка Китикэтом!");
            
        } else {

             System.out.println(name + " пробежал " + distanceRun + " м.");

        }

        System.out.println(name + " проплыл " + distanceSwim + " м." + "\n" + 
                            "Котик не умеет плавать!");

    }

    void checkSatiety(int quantityFoodInBowl) {

        if(quantityFoodInBowl >= 10){

            satiety = true;

            System.out.println("Вы дали " + name + " " + quantityFoodInBowl + " еды.");
            System.out.println(name + " наелся?" + satiety);

            } else {

            System.out.println("Вы дали " + name + " " + quantityFoodInBowl + " еды, " + "\n" + 
            name + " наелся?: " + satiety + "\n" +
            " Котик обиделся и ушел.");

        } 
    }
}

