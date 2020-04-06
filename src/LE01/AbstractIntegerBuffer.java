package LE01;

public abstract class AbstractIntegerBuffer
{
    int size = 0;
    Integer[] array;

    public void push(Integer i)
    {

    }
    public int capacity()
    {
        return array.length;
    }
    public int size()
    {
        return size;
    }
}
