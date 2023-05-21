
import java.sql.Date;

import Controller.iCalculateNetSalary;
import EmployeeDomen.Employee;
import EmployeeDomen.Salary;
import EmployeeDomen.CalculateNetSalary;

public class App {
    public static void main(String[] args) throws Exception {
        
        Employee person1 = new Employee("Иванов", new Date(68- 10- 10));
        Salary salary = new Salary(50000);
        iCalculateNetSalary calcSalary = new CalculateNetSalary(salary);
        int netSalary = calcSalary.calculateNetSalary();
        System.out.println(person1.getEmpInfo() + " зарабатывает " + netSalary + " рублей.");
        
}
}
