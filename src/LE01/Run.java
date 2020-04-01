package LE01;

public class Run
{
    public static void main(String[] args)
    {
        Lifo bla;
        bla = new Lifo(4);
        bla.push(420);
        bla.push(67);
        bla.push(68);
        bla.push(69);
        System.out.println(bla.pop());
        System.out.println(bla.pop());
        System.out.println(bla.pop());
        System.out.println(bla.pop());
        System.out.println(bla.pop());
        bla.push(99);
        System.out.println(bla.pop());
    }
}
