import model.Employee;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Benadette", "Employee");

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Role: " + emp.getRole());
    }
}
