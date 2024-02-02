package string.utils;

public class IterLetter 
{
    public String word;
    private int cnt;
    public IterLetter(String in)
    {
        if(in == null)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.word = in;
            this.cnt=0;
        }

    }
    public void printNext()
    {
        if (cnt < this.word.length())
        {
            System.out.println(this.word.charAt(cnt));
            cnt++;
        }
        else
        {
            System.out.println();
        }
    }
    public void reset()
    {
        this.cnt=0;
    }
    public boolean hasNext()
    {
        boolean next = (word.length() > cnt) ? true : false;
        return next;
    }
    public int getCnt()
    {
        return cnt;
    }
}
