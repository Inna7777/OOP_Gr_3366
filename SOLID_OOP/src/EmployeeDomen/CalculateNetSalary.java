package EmployeeDomen;

import Controller.iCalculateNetSalary;

public class CalculateNetSalary implements iCalculateNetSalary {
    private Salary salary;

    public CalculateNetSalary(Salary salary) {
        this.salary = salary;
    }

    // метод расчета заработной платы сотрудника
    public int calculateNetSalary() {        
        int tax = (int) (salary.getBaseSalary() * 0.25);
        return salary.getBaseSalary() - tax;
    }
}

