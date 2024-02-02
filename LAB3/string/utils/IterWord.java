package string.utils;

public class IterWord 
{
    public String word;
    private int cnt;

    public IterWord(String word)
    {
        this.word = word;
    }
    public void prinNext()
    {
        System.out.println(this.word);
        cnt++;
    }
    public void restart()
    {
        this.cnt=0;
    }
    public boolean hasNext(int length)
    {
        boolean next = (length > cnt) ? true : false;
        return next;
    }
    public int getCnt()
    {
        return this.cnt;
    }
    
}
