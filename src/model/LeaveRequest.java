package model;

public class LeaveRequest {

    private int requestId;
    private String startDate;
    private String endDate;
    private String reason;
    private LeaveStatus status;
    private Employee employee;

    public LeaveRequest(int requestId, String startDate, String endDate, String reason, Employee employee) {
        this.requestId = requestId;
        this.startDate = startDate;
        this.endDate = endDate ;
        this.reason = reason;
        this.status = LeaveStatus.PENDING;
        this.employee = employee;
    }

     public void approve() {
        status = LeaveStatus.APPROVED;
    }

    public void reject() {
        status = LeaveStatus.REJECTED;
    }

    public LeaveStatus getStatus() {
        return status;
    }

    public String getSummary() {
    return "Leave Request ID: " + requestId +
           "\nEmployee: " + employee.getName() +
           "\nReason: " + reason +
           "\nStatus: " + status;
    }
}