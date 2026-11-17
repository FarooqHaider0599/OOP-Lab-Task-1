package Inheritance;
 class calculator {
    int add(int a , int b)
    {
        return a + b ; 
    }
    int subtarct(int a , int b)
    {
        return a - b ;
    }
    int multiply(int a , int b)
    {
        return a * b ;
    }
    double divide(double a , double b)
    {
        return  a / b ;
    }
}
  class scientificCalculator extends calculator
{
    double square(double a)
    {
        return a * a ;

    }
    double power(double a , double b)
    {
        return Math.pow(a,b) ;
    }
    double squareroot(double a)
    {
        return Math.sqrt(a);
    }
} 
public class P8 
{
    public static void main(String[] args) 
    {
        scientificCalculator sc = new scientificCalculator();
        
        sc.add(5, 10) ;
        sc.subtarct(10, 5) ;
        sc.multiply(5, 10) ;
        sc.divide(5, 10) ;
        sc.square(5) ;
        sc.power(5, 10) ;
        sc.squareroot(10) ;
        
    }    
}
