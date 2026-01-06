import model.Employee;
import model.Employer;
import model.LeaveRequest;

import java.util.Scanner;

public class Main {

    static LeaveRequest currentLeave = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("  LEAVE REQUEST SYSTEM");
        System.out.println("================================");

        while (true) {
            System.out.println("\nLogin as:");
            System.out.println("1. Employee");
            System.out.println("2. Employer");
            System.out.println("0. Exit");

            System.out.print("Choose role: ");
            int role = scanner.nextInt();
            scanner.nextLine(); 

            if (role == 1) {
                employeeFlow(scanner);
            } else if (role == 2) {
                employerFlow(scanner);
            } else if (role == 0) {
                System.out.println("Exiting system. Goodbye!");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    static void employeeFlow(Scanner scanner) {

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        Employee emp = new Employee(1, name, "Employee");

        while (true) {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Apply for Leave");
            System.out.println("2. View Leave Status");
            System.out.println("0. Logout");

            System.out.println("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    applyForLeave(scanner, emp);
                    break;
                case 2:
                    viewLeave();
                    break;
                case 0:
                    System.out.println("Employee logged out.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void employerFlow(Scanner scanner) {

        Employer employer = new Employer(2, "Employer");

        while (true) {
            System.out.println("\n--- Manager Menu ---");
            System.out.println("1. View & Process Leave Request");
            System.out.println("0. Logout");

            System.out.println("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    processLeave(scanner);
                    break;
                case 0:
                    System.out.println("Employer logged out.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void applyForLeave(Scanner scanner, Employee emp) {

        System.out.print("Enter leave reason: ");
        String reason = scanner.nextLine();

        if (reason.isEmpty()) {
            System.out.println("Leave reason cannot be empty.");
            return;
        }

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
            System.out.println("No leave request available.");
            return;
        }

        System.out.println("\nLeave Details:");
        System.out.println(currentLeave.getSummary());

        System.out.println("\n1. Approve Leave");
        System.out.println("2. Reject Leave");
        System.out.println("Choose: ");
        int decision = scanner.nextInt();
        scanner.nextLine();

        if (decision == 1) {
            currentLeave.approve();
            System.out.println("Leave approved.");
        } else if (decision == 2) {
            currentLeave.reject();
            System.out.println("Leave rejected.");
        } else {
            System.out.println("Invalid option.");
        }
    }

    static void viewLeave() {

        if (currentLeave == null) {
            System.out.println("No leave request submitted yet.");
        } else {
            System.out.println(currentLeave.getSummary());
        }
    }
}
