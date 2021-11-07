public class Accountant {
    private final static float staffSalary = 10000;
    private final static float managerSalary = 20000;
    private final static float executiveSalary = 30000;

    public void paySalary(Employee employee) {
        double salary;
        switch (employee.getRole()) {
            case STAFF: salary = staffSalary;
                break;
            case MANAGER: salary = managerSalary;
                break;
            case EXECUTIVE: salary = executiveSalary;
                break;
            default: throw new IllegalArgumentException("Undefined role");
        }
        System.out.println(employee.getGivenName() + " " + employee.getSurName() + ". salary: " + salary);
    }

    public void payPremium(Employee employee) {
        double premium;
        switch (employee.getRole()) {
            case STAFF: premium = staffSalary * employee.getRole().getPercents();
                break;
            case MANAGER: premium = managerSalary * employee.getRole().getPercents();
                break;
            case EXECUTIVE: premium = executiveSalary * employee.getRole().getPercents();
                break;
            default: throw new IllegalArgumentException("Undefined role");
        }
        System.out.println(employee.getGivenName() + " " + employee.getSurName() + ". Premium: " + premium);
    }
}
