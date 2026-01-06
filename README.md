# Leave Request System

A console-based Java application that allows employees to apply for leave and managers to approve or reject leave requests.  
The project is built using vanilla Java to demonstrate core Object-Oriented Programming concepts.

---

## Description
The Leave Request System simulates a simple real-world leave management process.  
Employees submit leave requests with a reason, and managers review and decide whether to approve or reject the request.  
All interactions are handled through a console-based menu.

---

## Features
- Role-based system (Employee and Manager)
- Employee can apply for leave and view leave status
- Manager can view leave details and approve or reject requests
- Leave statuses: PENDING, APPROVED, REJECTED
- Input validation and basic error handling

---

## OOP Concepts Implemented
- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Methods
- Enums
- Error handling
- Input validation

---

## Project Structure
leaveRequestSystem/
├── src/
│ ├── Main.java
│ └── model/
│ ├── Employee.java
│ ├── Employer.java
│ ├── LeaveRequest.java
│ └── LeaveStatus.java
└── README.md


---

## Application Flow
1. User selects a role (Employee or Manager)
2. Employee logs in using their name
3. Employee submits a leave request with a reason
4. Manager logs in and reviews the request
5. Manager approves or rejects the leave
6. Leave status updates accordingly

---

## How to Run the Application

### Clone the repository
```bash
git clone git@github.com:MissMokandu/leaveRequestSystem.git
cd leaveRequestSystem/src
