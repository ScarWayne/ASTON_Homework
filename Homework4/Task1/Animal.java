package Homework4.Task1;

abstract class Animal{

    protected String name;
    protected int distanceRun;
    protected int distanceSwim;
    
    Animal(String name, int distanceRun, int distanceSwim) {

        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        
    }

    String getName() {

        return name;

    }

    void setDistance(int newDistanceRun, int newDistanceSwim) {
        if(newDistanceRun >= 0 && newDistanceSwim >= 0){
            distanceRun = newDistanceRun;
            distanceSwim = newDistanceSwim;
        }
    }

    void printDistance() {

        System.out.println(name + " пробежал " + distanceRun + " м.");
        System.out.println(name + " проплыл " + distanceSwim + " м.");

    }
   
    void checkSatiety(int quantityFood) {
    }

}
