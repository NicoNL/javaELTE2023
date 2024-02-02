package magic;

import magic.library.Incantation;

public class Soliloquy
{
    public static void main(String[] args)
    {
        String firstFour = "Programming is a fun and creative activity";
        String second = "to be or not to be";
        int arg5 = 1;
        int arg6 = 4;
        magic.library.Incantation in1 = new magic.library.Incantation(firstFour, 0);
        magic.library.Incantation in2 = new magic.library.Incantation(second, 0);
        magic.library.Incantation in3 = new magic.library.Incantation(in2);

        reciteIncantations(in1,in2,arg5,true);
        in1.SetInt(arg6);
        reciteIncantations(in1, in2, arg6, false);
    }
    public static void reciteIncantations(Incantation in1,Incantation in2,int index, boolean b)
    {
        for(int i=0; i <= 2;i++)
        {
            if(i == 0)
            {
                in1.enchant(in2,!b);
                in1.PrintStatus();
                in2.PrintStatus();
                in1.SetInt(index);

            }
            else if (i == 1) 
            {
                in1.enchant(in2, b);
                in1.PrintStatus();
                in2.PrintStatus();
            }
            else
            {
                in1.enchant(in2, true);
                in1.PrintStatus();
                in2.PrintStatus();
            }
        }


    }
    
}
