package com.example.girlswhocode.test_project;

/**
 * Created by Girls Who Code on 4/24/2016.
 */
public class Food {
    public String[]  foodArr;
    int[]  calorieArr;

    public Food() {
        foodArr = new String[5];
        calorieArr = new int[5];
    }

    public void fillArrVal(){
        foodArr[0] = "bagel";
        foodArr[1] = "cake";
        foodArr[2] = "bread";
        foodArr[3] = "pizza";
        foodArr[4] = "pasta";

        calorieArr[0] = 245;
        calorieArr[1] = 1912;
        calorieArr[2] = 79;
        calorieArr[3] = 285;
        calorieArr[4] = 158;

    }

    public int getFoodLength(){
        return foodArr.length;
    }

    public String getFoodName(int num){
        return foodArr[num];
    }

    public int getFoodCal(String foodName){
        for(int i = 0; i < 5; i++){
            if(foodArr[i] == foodName) return calorieArr[i];
        }
        return -10;
    }
}
