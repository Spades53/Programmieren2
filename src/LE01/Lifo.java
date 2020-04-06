package LE01;

import java.util.Random;

public class Lifo extends AbstractIntegerBuffer
{
    public Lifo()
    {
        //Speicherobjekt mit mind. 3 und max 100 Elementen
        Random random = new Random();
        array = new Integer[random.nextInt(98) + 3];
    }

    public Lifo(int s)
    {
        //Speicherobjekt mit s Anzahl an Elementen
        array = new Integer[s];
    }

    public Integer pop()
    {
        Integer returnIndex = array[size];
        array[size] = null;
        size--;
        return returnIndex;
    }
}


