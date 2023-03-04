package sem1;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Hello,World!");
        System.out.println(LocalDateTime.now());
        System.out.print("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();
        System.out.printf("Inputed value:%d",value);
        scanner.close();
    }
    
}


