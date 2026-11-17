package Inheritance ;
class Area
{
    void area(int side)
    {
        int a =side * side ;
        System.out.println("1st Area is...:" + a);
    }
    void area(int lenght , int width)
    {
        int a = lenght * width ;
        System.out.println("2nd Area is...:" + a);
    }
}
public class P12
{
    public static void main(String[] args) 
    {
        Area a = new Area() ;
        a.area(5);
        a.area(4, 3);
    }
}
