package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupServis;
import StudentService.StudentService;

public class StudentController implements iUserControllers<Student> {
    /**
     * финальный экземпляр класса
     */
    private final StudentService dataService = new StudentService();
    private final StudentGroupServis groupServis = new StudentGroupServis();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
        
    }
   
    
    
}
