package bsu.rfe.java.group9.Krasilnikova.varB12;

import java.util.Arrays;

public class MainApplication
{
    public static void main(String[] args)
    {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg: args)
        {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese"))
            {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple"))
            {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Beef"))
            {
                breakfast[itemsSoFar] = new Beef(parts[1]);
            }
            itemsSoFar++;
        }
            Arrays.sort(breakfast, new FoodComparator());
        for (Food item: breakfast)
            if (item!=null)
            {
                item.consume();
                System.out.println(item.calculateCalories() + " калорий");
            } else
                break;

        double CaloriesCounter=0;
        for (Food item: breakfast)
        {
            if (item!=null)
                CaloriesCounter += item.calculateCalories();
            else
                break;
        }
        System.out.println("Общая кaлорийность завтрака = " + CaloriesCounter + " калорий");
        System.out.println("\n" + "Всего хорошего!");
    }
}

