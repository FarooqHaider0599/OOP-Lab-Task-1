package Inheritance;

class multiply
{

    void mul(int a , int b)
    {
        int x = a * b ;
        System.out.println("Multiplication Is... =" + x);
    }
    void mul(double a , double b )
    {
        double c = a * b ;
        System.out.println("Multiplication Is... =" + c);
    }
}
public class P11 
{
    public static void main(String[] args)
    {
        multiply m = new multiply();
        m.mul(8, 10);    
        m.mul(3.0, 4.0);
    }
    
}
