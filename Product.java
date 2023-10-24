//Two numbers are given, find their Product.

public class Product
{
    public static int calProduct(int a, int b)
    {
        return a*b;
    }
    public static void main(String [] args)
    {
        int num1 = 12;
        int num2 = 10;

        int product = calProduct(num1, num2);

        System.out.println(product);
    }
}