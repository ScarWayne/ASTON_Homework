package Homework4.Task1;

class CatsBowl{
    
    private int quantityFoodInBowl = 0;
         
    void setFillTheBowl(int quantityFood) {

        if(quantityFood >= 0) {

            quantityFoodInBowl = quantityFood;

        }
    }
    
    int getQuantityFoodInBowl() {

        return quantityFoodInBowl;
        
    }
}
