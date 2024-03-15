public class PermanentEmployee extends Employee {

    private  String employeeSeniority;

    public PermanentEmployee(String name, int age, int employeeId, double salary, String employeeSeniority) {
        super(name, age, employeeId, salary);
        this.employeeSeniority = employeeSeniority;
    }

    public PermanentEmployee(int employeeId, double salary, String employeeSeniority) {
        super(employeeId, salary);
        this.employeeSeniority = employeeSeniority;
    }

    public PermanentEmployee(String employeeSeniority) {
        this.employeeSeniority = employeeSeniority;
    }


    public PermanentEmployee() {
    }


    //s
    public String getEmployeeSeniority() {
        return employeeSeniority;
    }

    public void setEmployeeSeniority(String employeeSeniority) {
        this.employeeSeniority = employeeSeniority;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "employeeSeniority='" + employeeSeniority + '\'' +
                '}';
    }
}
