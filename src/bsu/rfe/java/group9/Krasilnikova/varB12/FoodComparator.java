package bsu.rfe.java.group9.Krasilnikova.varB12;

import java.util.Comparator;
public class FoodComparator implements Comparator<Food>
{
    /*public int compare(Food arg0, Food arg1)
    {
        // если 1-ый объект = null, то он всегда "больше", т.е. перемещается в конец массива
        if (arg0==null) return 1;
        // если 2-ой объект = null, а 1-ый - нет (не сработала предыдущая строчка), то 1-ый всегда меньше, т.е. перемешается в начало массива
        if (arg1==null) return -1;
        // если оба объекта не null, то результат сравнения определяется сравнением их name
        return arg0.getName().compareTo(arg1.getName());
    }*/
    public int compare(Food arg0, Food arg1)
    {
        if (arg0 == null || ((Food)arg0).calculateCalories() < ((Food)arg1).calculateCalories())
        {
            return 1;
        }
        if (arg1 == null || ((Food)arg0).calculateCalories() > ((Food)arg1).calculateCalories())
        {
            return -1;
        }
        else return 0;
    }
}
