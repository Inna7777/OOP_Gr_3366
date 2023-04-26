package Controllers;
import StudentDomen.User;
import StudentDomen.Emploee;
import StudentService.EmploeeService;
/**
 * контролер для сотрудников
 */

public class EmploeeController implements iUserControllers<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String firstName, String secondName, int age) {
       empService.create(firstName, secondName, age);
    }

    /**
     * @param <T>
     * @param person
     */
     public <T> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName()+" зп 10000");
    }
    
}
