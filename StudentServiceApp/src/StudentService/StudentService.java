package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.AverageAgeCalculator;
import StudentDomen.Student;


public class StudentService implements iUserService<Student>{
    private int count;
    private List<Student> students;//список студентов

    /**
     * конструктор для записи студентов
     */
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
    
    static public  double calculateAverageAge(List<Student> students) {
        AverageAgeCalculator<Student> calculator = new AverageAgeCalculator<>(students);
        return calculator.calculateAverageAge();
    }
}
