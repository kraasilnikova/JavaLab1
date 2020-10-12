package bsu.rfe.java.group9.Krasilnikova.varB12;

public class Beef extends Food
{
    private String readiness;
    private Double calories;
    public Beef(String readiness)
    {
        super("Мясо");
        this.readiness = readiness;
    }
    public void consume()
    {
        System.out.println(this + " съедено");
    }
    public boolean equals(Object arg0) //переопределние метода сравнения
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Beef)) return false;
            return readiness.equals(((Beef) arg0).readiness);
        } else
            return false;
    }
    public Double calculateCalories()
    {
        if(readiness.equals("с_кровью"))
        {
            calories = 216.0;
        }
        else if(readiness.equals("норма"))
        {
            calories = 143.0;
        }
        else if(readiness.equals("прожаренное"))
        {
            calories = 384.0;
        }
        return calories;
    }
    public String getReadiness()
    {
        return readiness;
    }
    public void setReadiness(String readiness)
    {
        this.readiness = readiness;
    }
    public String toString() //переопределение метода преобразования в строку
    {
        return super.toString() + " '" + readiness.toUpperCase() + "'";
    }
}
