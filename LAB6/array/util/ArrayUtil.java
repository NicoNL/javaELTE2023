package array.util;

public class ArrayUtil
{
    public static int max(int[] arr)
    {
        if(arr.length < 1)
        {
            return 0;
        }
        else
        {
            int index = Integer.MIN_VALUE;
            for(int i =1; i< arr.length; i++)
            {
                if(index < arr[i])
                {
                index = arr[i];
                }
            }
            return index;
        }        
    }
    public static int max2(int[] arr)
    {
        if(arr.length < 1)
        {
            return 0;
        }
        else
        {
            int index = Integer.MIN_VALUE;
            for(int i =1; i< arr.length; i++)
            {
                index = (index < arr[i]) ? index = arr[i] : index;
            }
            return index;
        }  
    }
    public static int max3(int[] arr)
    {
        if(arr.length < 1)
        {
            return 0;
        }
        else
        {
            int index = Integer.MIN_VALUE;
            for(int i =1; i< arr.length; i++)
            {
                index = Math.max(index,arr[i]);
            }
            return index;
        }  
    }
    public static int max4(int[] arr)
    {
        if(arr.length < 1)
        {
            return 0;
        }
        else
        {
            int index = Integer.MIN_VALUE;
            for(int n : arr)
            {
                if(index < n)
                {
                index = n;
                }
            }
            return index;
        }  
    }
    public static int[] minMax(int[] arr)
    {
        return arr;
    }

}

