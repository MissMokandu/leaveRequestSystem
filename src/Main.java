import model.Employee;
import model.Employer;
import model.LeaveRequest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }

            Employee emp = new Employee(id, name, "Employee");

            LeaveRequest leave = new LeaveRequest(
                    101,
                    "2026-01-10",
                    "2026-01-15",
                    "Annual leave",
                    emp
            );

            System.out.println("Leave created successfully:");
            System.out.println(leave.getSummary());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}



