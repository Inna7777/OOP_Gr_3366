package EmployeeDomen;

import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;

//  конструктор
public Employee(String name, Date dob) {
    this.name = name;
    this.dob = dob;
    
}
// метод возврата информации о сотруднике
public String getEmpInfo() {
return "name - " + name + " , dob - " + dob.toString();
}

}
