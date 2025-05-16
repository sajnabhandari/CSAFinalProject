import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
public class Journal {
private ArrayList<Goal> goals = new ArrayList<>();
private Scanner input = new Scanner(System.in);
private User user;
public Journal(User user) {
    this.user = user;
}
public void run() {
 System.out.println("Welcome, " + user.getName() + "!");
 boolean running = true;
 while (running) {
    System.out.println("\n1. Add Goal\n2. View Goals\n3. Mark Goal Completed\n4. Add Reflection\n5. Exit");
    System.out.print("Choose an option: ");
    int choice = input.nextInt();
    input.nextLine(); // clears newline
    switch (choice) { // switch-case statement!
        case 1:
         addGoal();
        case 2 :
         viewGoals();
        case 3 :
         markCompleted();
        case 4 :
         addReflection();
        case 5 :
         running = false;
        System.out.println("Goodbye!");
    
        default :
        System.out.println("Invalid choice.");
     }
    }
}

    private void addGoal() {
        System.out.print("Enter goal description: ");
        String desc = input.nextLine();
        System.out.print("Enter goal date (YYYY-MM-DD): ");
        String dateStr = input.nextLine();
        LocalDate date = LocalDate.parse(dateStr);
        goals.add(new Goal(desc, date));
        user.addGoals(1);
        System.out.println("Goal added.");
    }

    private void viewGoals() {
        if (goals.isEmpty()) {
            System.out.println("No goals added yet.");
            return;
        }
        for (int i = 0; i < goals.size(); i++) {
            System.out.println(i + ": " + goals.get(i));
        }
    }

    private void markCompleted() {
        viewGoals();
        System.out.print("Enter goal number to mark completed: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < goals.size()) {
            goals.get(index).markCompleted();
            System.out.println("Marked as completed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private void addReflection() {
        viewGoals();
        System.out.print("Enter goal number to reflect on: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < goals.size()) {
            System.out.print("Write your reflection: ");
            String reflection = input.nextLine();
            goals.get(index).addReflection(reflection);
            System.out.println("Reflection added.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
