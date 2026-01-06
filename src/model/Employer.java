package model;

public class Employer extends Employee{
    public Employer(int id, String name) {
        super(id, name, "Employer");
    }
    @Override
    public String getApprovalRole(){
        return "Employer (can approve leave)";
    }
}