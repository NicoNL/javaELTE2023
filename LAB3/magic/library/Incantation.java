package magic.library;

public class Incantation 
{
    public String text;
    public int index;

    public Incantation(String text, int index)
    {
        if(text == null)
        {
            throw new IllegalArgumentException("Invalid argument");
        }
        else
        {
            this.text = text;
            this.index = index;
        }
    }
    public Incantation(Incantation in)
    {
        this.text = in.GetText();
        this.index = in.GetIndex();
    }
    public String GetText()
    {
        return text;
    }
    public int GetIndex()
    {
        return index;
    }
    public void SetInt(int index)
    {
        this.index = index;
    }

    public boolean enchant(Incantation in, boolean b)
    {
        String[] words = text.split(" ");
        if(1 > index || words.length < index)
        {
            return false;
        }
        
        String word = words[index-1];

        if(b)
        {
            in.text = word + " " + in.text;
        }
        else
        {
            in.text = in.text + " " + word;
        }

        index += b ? -1 : 1;

        return true;
    }
    public void PrintStatus()
    {
        System.out.println(GetText());
    }


}
