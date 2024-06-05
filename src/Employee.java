import java.util.Date;
public class Employee extends Person{
    int hireDate;
    String companyName;
    double Salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        Salary = salary;
    }

    public Employee(String firstName, String lastName, int birthdayYear) {
        super(firstName, lastName, birthdayYear);
    }
public int getJobSeniority(){
        return 2024 - hireDate;
}
public double getSalary(){
        return Salary;
}
    @Override
    int getAge() {
        return 2024-birthdayYear;
    }

}
