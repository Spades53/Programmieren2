package LE01;

public abstract class AbstractIntegerBuffer implements IntegerBuffer
{
    int size = 0;
    Integer[] array;

    public void push(Integer i)
    {
        if(size>0)
        {
            array[(array.length - size)] = i;
            this.size++;
        }
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
