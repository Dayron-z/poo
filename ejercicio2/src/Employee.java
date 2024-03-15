public class Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee() {
    }




    //S
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}
