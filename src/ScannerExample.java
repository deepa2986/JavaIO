import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("Please enter your age : ");
        int age =  scanner.nextInt();
        scanner.nextLine();
        System.out.println(age);

        System.out.print("Please enter your occupation : ");
        String occupation = scanner.nextLine();
        System.out.println(occupation);


    }
}
