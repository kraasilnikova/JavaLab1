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
            itemsSoFar++;
        }
        for (Food item: breakfast) //перебор всех элементов массива
            if (item!=null)
                item.consume(); //если элемент не null – употребить продукт
            else
                break;
        System.out.println("Всего хорошего!");
    }
}

