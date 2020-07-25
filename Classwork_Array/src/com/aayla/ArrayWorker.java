package com.aayla;

public class ArrayWorker
{
    private final int[ ] values;

    public ArrayWorker(int[] theValues)
    {
        values = theValues;
    }

    public void doubleLastHalf()
    {
        for (int i = values.length / 2; i < values.length; i++)
        {
            values[i] = values[i] * 2;
        }
    }

    public void printArray()
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.println(  values[i] );
        }
    }

    public static void main(String[] args)
    {
        int[] numArray = {3,8,-3, 2};
        ArrayWorker worker = new ArrayWorker(numArray);
        worker.doubleLastHalf();
        worker.printArray();
        numArray = new int[]{3,8,-3};
        worker = new ArrayWorker(numArray);
        worker.doubleLastHalf();
        worker.printArray();
    }
}