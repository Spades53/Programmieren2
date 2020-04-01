package LE01;

import java.util.Random;

public class Lifo
{
    int size;
    Integer[] elements;
    int capacity;
    int objectCount = 0;
    int returnInt;

    public Lifo()
    {
        //Speicherobjekt mit mind. 3 und max 100 Elementen
        Random random = new Random();
        this.size = random.nextInt(97)+3;
        this.capacity = this.size;
        elements = new Integer[this.size];
    }
    public Lifo(int s)
    {
        //Speicherobjekt mit s Anzahl an Elementen
        this.size = s;
        this.capacity = this.size;
        elements = new Integer[this.size];
    }
    public void push(Integer s)
    {
        if(capacity>0)
        {
            elements[(this.size - capacity)] = s;
            this.capacity--;
            this.objectCount++;
        }
    }
    public Integer pop()
    {
        if(objectCount > 0)
        {
        returnInt = elements[objectCount-1];
        elements[objectCount-1] = null;
        this.objectCount--;
        this.capacity++;
        return returnInt;
        }
        else
        {
            return null;
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

}


