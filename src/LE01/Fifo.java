package LE01;

import java.util.Random;

public class Fifo extends AbstractIntegerBuffer
{
    public Fifo()
    {
        //Speicherobjekt mit mind. 3 und max 100 Elementen
        Random random = new Random();
        array = new Integer[random.nextInt(98) + 3];
    }

    public Fifo(int s)
    {
        //Speicherobjekt mit s Anzahl an Elementen
        array = new Integer[s];
    }

    public Integer pop()
    {
        Integer returnInteger = array[0];
        Integer[] helpArray = array;

        for (int i = 0; i < array.length; i++)
        {
            array[i] = helpArray[i+1];
        }

        size--;
        return returnInteger;
    }
}
