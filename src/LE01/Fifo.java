package LE01;

import java.util.Random;

public class Fifo
{
    int arraySize;
    Integer[] elements;
    int capacity;
    int objectCount = 0;
    int returnInt;

    public Fifo()
    {
        //Speicherobjekt mit mind. 3 und max 100 Elementen
        Random random = new Random();
        this.arraySize = random.nextInt(97)+3;
        this.capacity = this.arraySize;
        elements = new Integer[this.arraySize];
    }
    public Fifo(int s)
    {
        //Speicherobjekt mit s Anzahl an Elementen
        this.arraySize = s;
        this.capacity = this.arraySize;
        elements = new Integer[this.arraySize];
    }
    public void push(Integer s)
    {
        if(capacity>0)
        {
            elements[(this.arraySize -capacity)] = s;
            this.capacity--;
            this.objectCount++;
        }
    }
    public Integer pop()
    {
        if (objectCount > 0)
        {
            this.capacity++;
            this.objectCount--;
            returnInt = elements[0];
            for (int i = 1; i < this.arraySize; i++)
            {
                elements[i - 1] = elements[i];
                elements[i] = null;
            }
            return returnInt;
        } else
        {
            return elements[0];
        }
        }
    public int size()
    {
        return this.objectCount;
    }
    public int capacity()
    {
        return this.capacity;
    }
    public void test(int s)
    {
        System.out.println(elements[s]);
    }

}
