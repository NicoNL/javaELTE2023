package string.stringmain;

import string.utils.IterLetter;

public class Main 
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[2]);
        int k = Integer.parseInt(args[3]);
        string.utils.IterLetter letter = new IterLetter(args[1]);
        printN(n, letter);
        printI(n,k,letter);
    }
    public static void printN(int n,  string.utils.IterLetter letter)
    {
        for(int i = 0; i < n ;i++)
        {
            letter.printNext();
        }
    }
    public static void printI(int m, int k, string.utils.IterLetter letter)
    {
        int cnt = letter.getCnt();
        if(cnt >= m)
        {
            letter.reset();
            for(int i = 0; i < k ;i++)
            {
                letter.printNext();
            }
        }

    }
    
}
