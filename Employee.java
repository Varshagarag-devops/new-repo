public class Employee {
    String name;
    int id;
    double salary;
    int phno;

    public Employee(String name, int id, double salary, int phno) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phno = phno;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $ " + salary);
        System.out.println("Phno: " + phno);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0, 67484);
        emp1.displayInfo();
        Employee emp2 = new Employee("XYZ", 102, 55000.0, 6759449);
        emp2.displayInfo();
        Employee emp3 = new Employee("XYZ", 103, 60000.0, 6450903);
        emp3.displayInfo();
    }
}
