import java.util.function.*;
import java.util.List;

public class MyClass
{
    public static void main(String[] args)
    {
        List<Employee> list = Employee.createShortList();
        Accountant accountant = new Accountant();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGender() == Employee.Gender.FEMALE) {
                accountant.payPremium(list.get(i));
            }
            if(list.get(i).getDept() == "debt3") {
                accountant.paySalary(list.get(i));
            }
            if(list.get(i).getAge() > 30 && list.get(i).getDept() == "debt4") {
                accountant.payPremium(list.get(i));
            }
            if(list.get(i).getRole() == Role.MANAGER) {
                accountant.paySalary(list.get(i));
            }
            if(list.get(i).getRole() == Role.STAFF) {
                accountant.payPremium(list.get(i));
            }
        }

    }

    Supplier<Employee> newEmployee = () -> Employee.builder().givenName("Stanley").surName("surname8").age(28).gender(Employee.Gender.MALE).role(Role.MANAGER).dept("dept8").eMail("Email8").phone("89174635288").address("address8").city("city8").state("state8").code("130").build();

    Function<Employee, String> getAddressWithCity = employee -> employee.getAddress() + " " + employee.getCity();

    Consumer<Employee> upPremium = employee -> { employee.getRole().upPercents(); };

    BiPredicate<Employee, String> nameEqualsToString = ((employee, address) -> employee.getAddress().equals(address));
}