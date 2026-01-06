import model.Employee;
import model.Employer;
import model.LeaveRequest;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Alice", "Employee");
        Employee manager = new Employer(2, "Bob");

        System.out.println(emp.getApprovalRole());
        System.out.println(manager.getApprovalRole());

        LeaveRequest leave = new LeaveRequest(
                101,
                "2026-01-10",
                "2026-01-15",
                "Annual leave",
                emp
        );

        System.out.println(leave.getSummary());
    }
}


