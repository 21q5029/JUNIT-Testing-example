package ch.bztf;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculate plus = new Calculate();
        Calculate minus = new Calculate();
        Calculate mal = new Calculate();
        Calculate durch = new Calculate();

        System.out.println("Addition: " +plus.add(10, 6));
        System.out.println("Subtraktion: " +minus.subtract(30, 25));
        System.out.println("Muliplikation: " +mal.multiply(20, 2));
        System.out.println("Division: " +durch.divide(10, 2));

    }
}
