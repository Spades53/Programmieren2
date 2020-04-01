package LE01;

import java.util.Random;

public class Lifo
{
    int arraySize;
    Integer[] elements;
    int capacity;
    int objectCount = 0;
    int returnInt;

    public Lifo()
    {
        //Speicherobjekt mit mind. 3 und max 100 Elementen
        Random random = new Random();
        this.arraySize = random.nextInt(97)+3;
        this.capacity = this.arraySize;
        elements = new Integer[this.arraySize];
    }
    public Lifo(int s)
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
        returnInt = elements[objectCount-1];
        elements[objectCount-1] = null;
        this.objectCount--;
        return returnInt;
    }
    public int size()
    {
        return this.objectCount;
    }
    public int capacity()
    {
        return this.capacity;
    }

}


