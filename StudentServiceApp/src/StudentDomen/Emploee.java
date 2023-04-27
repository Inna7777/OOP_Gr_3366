package StudentDomen;
/**
 * создаем класс сотрудников
 */
public class Emploee extends User {
    private int empId;
    
    /**
     * переопределяем конструктор от класса User, и добавляем поле empId
     * @param firstName
     * @param secondString
     * @param age
     * @param empId
     */
    public Emploee(String firstName, String secondName, int age , int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
      
    }
    /**
     * возвращаем Id сотрудника
     * @return
     */
    public int getEmpId() {
        return empId;
    }
    /**
     * определяем(задаем) id студента
     * @param empId
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    
    
    
}
