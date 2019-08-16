package main.test.designpattern.builderpattern;


import main.java.designpattern.builderpattern.service.impl.Meal;
import main.java.designpattern.builderpattern.service.impl.MealBuilder;

/**
 * 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}

