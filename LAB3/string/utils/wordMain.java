package string.utils;

public class wordMain 
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Not enough arguments were given");
        }
        else
        {
            int index = 0;
            string.utils.IterWord iterWord = new string.utils.IterWord(args[index]);
            
            while(iterWord.hasNext(args.length))
            {
                iterWord.prinNext();
                index =iterWord.getCnt();
                if(index < args.length)
                {
                    iterWord.word = args[index];
                }
            }
        }
    }
    
}
