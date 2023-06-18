package Practice;

public class Constructors {

}

class Employee {
    String name;
    int emp_id;

    Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(" Amit ", 101);
        Employee e2 = new Employee("Thakur ", 102);
        System.out.println(" Employee Name: " + e1.name + " Employee Id:  " + e1.emp_id);
        System.out.println(" Employee Name: " + e2.name + " Employee Id: " + e2.emp_id);
    }
}
