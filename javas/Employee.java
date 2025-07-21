public class Employee {
    int empId;
    String empName;
    Employee next;

    // constructor-->it initializes obj parameters
    Employee(int id, String name) {
        empId = id;
        empName = name;
        next = null;
    }
}
