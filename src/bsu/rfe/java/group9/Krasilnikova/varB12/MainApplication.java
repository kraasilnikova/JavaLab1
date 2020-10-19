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

        int apple =0;
        Food Apple = new Apple("большое");
        Food Apple1 = new Apple("среднее");
        Food Apple2 = new Apple("маленькое");
        for (Food item: breakfast)
        {
            if (item!=null)
            {
                if(item.equals(Apple) || item.equals(Apple1) || item.equals(Apple2))
                    apple++;
            }
        }
        System.out.println("\n" + "Яблок количеством: " + apple + " съедено.");
        int cheese = 0;
        Food Cheese = new Cheese();
        for (Food item: breakfast)
        {
            if (item!=null)
            {
                if(item.equals(Cheese))
                    cheese++;
            }
        }
        System.out.println("Сыра количеством: " + cheese + " съедено.");
        int beef = 0;
        Food Beef = new Beef("с кровью");
        Food Beef1 = new Beef("прожаренное");
        Food Beef2 = new Beef("норма");
        for (Food item: breakfast)
        {
            if (item!=null)
            {
                if(item.equals(Beef) || item.equals(Beef1) || item.equals(Beef2))
                    beef++;
            }
        }
        System.out.println("Мяса количеством: " + beef + " съедено.");

        System.out.println("Общая кaлорийность завтрака = " + CaloriesCounter + " калорий");
        System.out.println("\n" + "Всего хорошего!");
    }
}

