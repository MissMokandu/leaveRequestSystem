import model.Employee;
import model.LeaveRequest;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Alice", "Employee");

        LeaveRequest leave = new LeaveRequest(
                101,
                "2026-01-10",
                "2026-01-15",
                "Annual leave",
                emp
        );

        System.out.println(leave.getSummary());

        leave.approve();

        System.out.println("After approval:");
        System.out.println(leave.getSummary());
    }
}

