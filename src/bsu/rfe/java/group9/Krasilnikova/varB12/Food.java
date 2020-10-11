package bsu.rfe.java.group9.Krasilnikova.varB12;

public abstract class Food implements Consumable
{
    String name = null;
    public Food(String name)
    {
        this.name = name;
    }
    public boolean equals(Object arg0)
    {
        if (!(arg0 instanceof Food)) return false; //проверяется совместимость классов объектов
        if (name==null || ((Food)arg0).name==null) return false; //сконструированность объекта
        return name.equals(((Food)arg0).name); //определяет равенство или неравенство объектов
    }
    public String toString()
    {
        return name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
