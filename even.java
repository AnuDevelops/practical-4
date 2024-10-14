package practicals;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class even {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of numbers: ");
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            numbers.add(i);
            if (i % 2 == 0) { 
            System.out.println(i);
        }
        else {
            System.out.println("These are the even numbers in your list.");
        }
        System.out.println(i);
        
        }
    }
}
