package LE01;

import java.util.Random;

public class Fifo extends AbstractIntegerBuffer
{
    int arraySize;
    Integer[] elements;
    int capacity;
    int size = 0;
    int returnInt;

    public Fifo()
    {
        //Speicherobjekt mit mind. 3 und max 100 Elementen
        Random random = new Random();
        this.arraySize = random.nextInt(98)+3;
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
            this.size++;
        }
    }
    public Integer pop()
    {
        if (size > 0)
        {
            this.capacity++;
            this.size--;
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
    
    public void test(int s)
    {
        System.out.println(elements[s]);
    }

}
