import java.util.Scanner;

public class Sum {

    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {

        System.out.println("enter the number of elements");
        int numbers = scanner.nextInt() ;
        System.out.println("The average of entered numbers is "+ getaverage(getnumbers(numbers)) );

    }

    public static int[] getnumbers (int numbers)
    {
        int[] value  = new int[numbers] ;
        System.out.println("enter " + numbers + " numbers to calculate the sum and average");
        for (int i=0 ; i< value.length ; i++)
        {
            value[i] = scanner.nextInt() ;

        }
        return value;

    }

    public static double getaverage (int[] value)
    {
        int sum = 0 ;
        for (int i = 0 ; i < value.length ; i++ )
        {
            sum += value[i] ;
        }
        System.out.println("The sum of entered numbers is " + sum);
        double average = (double) sum / (double) value.length ;
        return average ;
    }

}
