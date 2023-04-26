package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService implements iUserService<Student>{
    private int count;
    private List<Student> students;
    public StudentService(){
        this.students = new ArrayList<Student>();
        

    }
     /**
     * метод добавления студента(регистрация)
     */
    @Override
    public void create(String firstName, String secondName, int age) {
       Student per = new Student(firstName, secondName, age, count);
       count++;
       students.add(per);
    }
    /**
     *  метод получения всех студентов
     */
    @Override
    public List<Student> getAll() {
        return students;
    }
    
}
