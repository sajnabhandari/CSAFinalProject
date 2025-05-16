import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        User user = new User(name);
        Journal goal = new Journal(user);
        goal.run();
    }
}
