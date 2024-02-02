package zoo.animal;

public class Panda 
{
    public String name;
    public int age;
    public String country;

    public Panda(String name, int age, String country)
    {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public Panda(int age, String country)
    {
        this.name = age + " years old foundling from " + country;
        this.age = age;
        this.country = country;
    }
    public void happyBirthday(int limitYear)
    {
        this.age++;
        System.out.println(String.format("Name: %s,Age: %d Country: %s",this.name,this.age,this.country));
        if (limitYear < this.age)
        {
            System.out.println(String.format("Panda %s is going to be repatriated to China",this.name));
        }
    }
    
}
