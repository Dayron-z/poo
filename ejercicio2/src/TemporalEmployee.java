public class TemporalEmployee extends Employee{

    private String finalContractDate;

    public TemporalEmployee(String name, int age, int employeeId, double salary, String finalContractDate) {
        super(name, age, employeeId, salary);
        this.finalContractDate = finalContractDate;
    }

    public TemporalEmployee(int employeeId, double salary, String finalContractDate) {
        super(employeeId, salary);
        this.finalContractDate = finalContractDate;
    }

    public TemporalEmployee(String finalContractDate) {
        this.finalContractDate = finalContractDate;
    }

    public TemporalEmployee() {
    }


    public String getFinalContractDate() {
        return finalContractDate;
    }

    public void setFinalContractDate(String finalContractDate) {
        this.finalContractDate = finalContractDate;
    }

    @Override
    public String toString() {
        return "TemporalEmployee{" +
                "finalContractDate='" + finalContractDate + '\'' +
                '}';
    }
}
