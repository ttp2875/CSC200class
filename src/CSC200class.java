import java.util.Scanner;
public class CSC200class {
    public static void main(String[] args){
        String name;
        String password;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your user name");
                name = keyboard.nextLine();
        System.out.println("Enter your password");
        password = keyboard.next();
        System.out.println("Hello " + name + " Welcome to CSC200 class! and Your password is " + password);
    }
}