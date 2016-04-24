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

        calorieArr[0] = 300;
        calorieArr[1] = 200;
        calorieArr[2] = 350;
        calorieArr[3] = 400;
        calorieArr[4] = 500;

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
