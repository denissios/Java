import java.util.List;
import java.util.ArrayList;

public class Employee {
    enum Gender {MALE, FEMALE};

    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private String dept;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String code;

    public Employee(String givenName, String surName, int age, Gender gender, Role role, String dept, String eMail, String phone, String address, String city, String state, String code) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.role = role;
        this.dept = dept;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return "Employee : " +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", role=" + role +
                ", dept='" + dept + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'';
    }

    public static List<Employee> createShortList()
    {
        List<Employee> list = new ArrayList<>();
        list.add(Employee.builder().givenName("Bob").surName("surName1").age(30).gender(Gender.MALE).role(Role.STAFF).dept("dept1").eMail("Email1").phone("89174635281").address("address1").city("city1").state("state1").code("123").build());
        list.add(Employee.builder().givenName("Kate").surName("surName2").age(31).gender(Gender.FEMALE).role(Role.MANAGER).dept("dept2").eMail("Email2").phone("89174635282").address("address2").city("city2").state("state2").code("124").build());
        list.add(Employee.builder().givenName("Mike").surName("surName3").age(32).gender(Gender.MALE).role(Role.EXECUTIVE).dept("dept3").eMail("Email3").phone("89174635283").address("address3").city("city3").state("state3").code("125").build());
        list.add(Employee.builder().givenName("Natasha").surName("surName4").age(33).gender(Gender.FEMALE).role(Role.STAFF).dept("dept4").eMail("Email4").phone("89174635284").address("address4").city("city4").state("state4").code("126").build());
        list.add(Employee.builder().givenName("Alex").surName("surName5").age(34).gender(Gender.MALE).role(Role.MANAGER).dept("dept5").eMail("Email5").phone("89174635285").address("address5").city("city5").state("state5").code("127").build());
        list.add(Employee.builder().givenName("Yana").surName("surName6").age(35).gender(Gender.FEMALE).role(Role.EXECUTIVE).dept("dept6").eMail("Email6").phone("89174635286").address("address6").city("city6").state("state6").code("128").build());
        list.add(Employee.builder().givenName("Nick").surName("surName7").age(36).gender(Gender.MALE).role(Role.STAFF).dept("dept7").eMail("Email7").phone("89174635287").address("address7").city("city7").state("state7").code("129").build());

        return list;
    }
}
