package LE01;

import java.util.Random;

public class Lifo implements IntegerBuffer
{
    private int capacity;
    private Integer[] elements;
    private int size;
    int objectCount = 0;
    int returnInt;

    public Lifo()
    {
        //Speicherobjekt mit mind. 3 und max 100 Elementen
        Random random = new Random();
        this.capacity = random.nextInt(98)+3;
        this.size = this.capacity;
        elements = new Integer[this.capacity];
    }
    public Lifo(int s)
    {
        //Speicherobjekt mit s Anzahl an Elementen
        this.capacity = s;
        this.size = this.capacity;
        elements = new Integer[this.capacity];
    }
    public void push(Integer s)
    {
        if(size>0)
        {
            elements[(this.capacity - size)] = s;
            this.size--;
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
        this.size++;
        return returnInt;
        }
        else
        {
            return null;
        }

    }
    public int size()
    {
        return this.size;
    }
    public int capacity()
    {
        return elements.length;
    }

}


