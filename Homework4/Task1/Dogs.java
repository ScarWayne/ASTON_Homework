package Homework4.Task1;

class Dog extends Animal{

    private int distanceRunUnreal;
    private int distanceSwimUnreal;

   Dog(String name) {

        super(name, 500, 10);
        
    }

    @Override

    public String getName() {

        return "Пес" + name;

    }

    void setDistance(int newDistanceRun, int newDistanceSwim) {

        if(newDistanceRun >= 0 && newDistanceRun <= 500) {

            distanceRun = newDistanceRun;

        } else {

            distanceRunUnreal = newDistanceRun;

        }

        if(newDistanceSwim >= 0 && newDistanceSwim <= 10) {

            distanceSwim = newDistanceSwim;

        } else {

            distanceSwimUnreal = newDistanceSwim;

        }
    }   

   void printDistance() {

        if(distanceRunUnreal > 500) {

            System.out.println(name + " пробежал " + distanceRun + "\n" + 
            "Песик выдохся на 500 метрах. Пожалей собачку.");

        }

        else {

            System.out.println(name + " пробежал " + distanceRun + " м.");

        }
        if(distanceSwimUnreal > 10) {

            System.out.println(name + " проплыл " + distanceSwim + " м." + "\n" + 
            "По опыту Муму отпускать собаку дальше 10 м в воде - плохая идея!");

        } else {

            System.out.println(name + " проплыл " + distanceSwim + " м.");

        }
    }
}
