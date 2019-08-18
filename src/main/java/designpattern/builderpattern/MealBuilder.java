package main.java.designpattern.builderpattern;


import main.java.designpattern.builderpattern.service.impl.*;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CokeDrink());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new MilkDrink());
        return meal;
    }
}

