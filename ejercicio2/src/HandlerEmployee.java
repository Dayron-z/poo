import java.util.ArrayList;
import java.util.Scanner;

public class HandlerEmployee {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner objScanner = new Scanner(System.in);

    public void addEmployee(){
        Person person = enterData();
        EmployeeType employeeType = typeEmployee();
        if (employeeType == EmployeeType.TEMPORALEMPLOYEE){
            employees.add(createTemporalEmployee(person));
        } else {
            employees.add(createPermanentEmployee(person));
        }
    }
    public Person enterData(){
        System.out.print("Enter your name:");
        String name = objScanner.next();
        System.out.print("Enter your age:");
        int age = objScanner.nextInt();

        return new Person(name, age);
    }
    public EmployeeType typeEmployee(){
        System.out.print("Enter your employee type (Permanent-employee / Temporal-employee):");
        String type = objScanner.next();

        if (type.equalsIgnoreCase("Permanent-employee")){
            return EmployeeType.PERMANENTEMPLOYEE;
        }else if (type.equalsIgnoreCase("Temporal-employee")){
            return EmployeeType.TEMPORALEMPLOYEE;
        }else {
            System.out.println("This option is not valid");
            type="";
            typeEmployee();
        }
        return null;
    }
    private PermanentEmployee createPermanentEmployee(Person person) {
        System.out.print("Enter your identification:");
        int employeeId = objScanner.nextInt();
        System.out.print("Enter your salary:");
        double salary = objScanner.nextDouble();
        System.out.print("Enter your employee seniority:");
        String employeeSeniority = objScanner.next();


        return new PermanentEmployee(person.getName(), person.getAge(),employeeId,salary,employeeSeniority);
    }
    public TemporalEmployee createTemporalEmployee(Person person){
        System.out.print("Enter your identification:");
        int employeeId = objScanner.nextInt();
        System.out.print("Enter your salary:");
        double salary = objScanner.nextDouble();
        System.out.print("Enter your final contract date:");
        String finalContractDate = objScanner.next();

        return new TemporalEmployee(person.getName(), person.getAge(),employeeId,salary,finalContractDate);
    }
    public void deleteEmployee(int id){
        employees.removeIf(employee -> employee.getEmployeeId() == id);
    }
    public void showEmployee(){
        for (Employee employee: employees){
            if( employee instanceof PermanentEmployee){
                PermanentEmployee permanentEmployee = (PermanentEmployee) employee;
                System.out.println(employee.toString());
                System.out.println(permanentEmployee.toString());
            }else{
                TemporalEmployee temporalEmployee = (TemporalEmployee) employee;
                System.out.println(employee.toString());
                System.out.println(temporalEmployee.toString());
            }
        }
    }
}
