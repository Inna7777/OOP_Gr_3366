package EmployeeDomen;
// класс отвечающий за расчет зарплаты
public class Salary {
    private int baseSalary;
  // конструктор  зарплаты  
 public Salary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    // назначение зарплаты
public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
    
}

// возвращает  зарплату
public int getBaseSalary() {
    return baseSalary;
}


       
}
