package bsu.rfe.java.group9.Krasilnikova.varB12;

public class Apple extends Food implements Nutritious
{
    private String size; //из-за создания нового поля нужно переопределить методы equals и toString
    private Double calories = null;

    public Apple(String size)
    {
        super("Яблоко"); //вызывает конструктор предка
        this.size = size;
    }
    public void consume()
    {
        System.out.println(this + " съедено");
    }
    public Double calculateCalories() //реализация метода подсчета калорий
    {
        if(size.equals("маленькое"))
        {
            calories = 15.0;
        }
        else if(size.equals("среднее"))
        {
            calories = 20.0;
        }
        else if(size.equals("большое"))
        {
            calories = 25.0;
        }
        return calories;
    }
    public String getSize() //возвращает размер яблока
    {
        return size;
    }
    public void setSize(String size) //модификатор для изменения поля данных РАЗМЕР
    {
        this.size = size;
    }
    public boolean equals(Object arg0) //переопределние метода сравнения
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }
    public String toString() //переопределение метода преобразования в строку
    {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
