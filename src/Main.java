import model.Employee;
import model.Employer;
import model.LeaveRequest;

import java.util.Scanner;

public class Main {

    static LeaveRequest currentLeave = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLeave Request System");
            System.out.println("1. Apply for Leave (Employee)");
            System.out.println("2. Approve / Reject Leave (Manager)");
            System.out.println("3. View Leave Status");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    applyForLeave(scanner);
                    break;
                case 2:
                    processLeave(scanner);
                    break;
                case 3:
                    viewLeave();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void applyForLeave(Scanner scanner) {

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Enter leave reason: ");
        String reason = scanner.nextLine();

        Employee emp = new Employee(1, name, "Employee");

        currentLeave = new LeaveRequest(
                1001,
                "2026-01-10",
                "2026-01-15",
                reason,
                emp
        );

        System.out.println("Leave request submitted successfully.");
    }

    static void processLeave(Scanner scanner) {

        if (currentLeave == null) {
            System.out.println("No leave request to process.");
            return;
        }

        System.out.println("1. Approve Leave");
        System.out.println("2. Reject Leave");
        System.out.print("Choose: ");
        int decision = scanner.nextInt();
        scanner.nextLine();

        if (decision == 1) {
            currentLeave.approve();
            System.out.println("Leave approved by employer.");
        } else if (decision == 2) {
            currentLeave.reject();
            System.out.println("Leave rejected by employer.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

  
    static void viewLeave() {

        if (currentLeave == null) {
            System.out.println("No leave request available.");
        } else {
            System.out.println(currentLeave.getSummary());
        }
    }
}