package zoo.keeper;

import zoo.animal.Panda;

public class Crikey 
{
    public static void main(String[]args)
    {
        Panda panda1 = new Panda("Pepe",19,"China");
        Panda panda2 = new Panda(15, "China");

        panda1.happyBirthday(18);
        panda2.happyBirthday(18);
    }
    
}
