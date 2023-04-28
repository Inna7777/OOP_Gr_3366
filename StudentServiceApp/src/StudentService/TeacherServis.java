package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.AverageAgeCalculator;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

/**
 * подключаем сервис (jenerics) iUserServis- для того чтобы использовать написаные там методы,  а не создавать их заново
 */
public class TeacherServis implements iUserService <Teacher>{
     private int count;
     private String academicDegree;
     private static  List<Teacher> teachers;
     
 
    
    
    /**
     * 
     */
    public TeacherServis(){
        // TeacherServis.teachers = new ArrayList<Teacher>();
        TeacherServis.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() 
    {
        return  teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher person = new Teacher(firstName, secondName, age, count, academicDegree);
        count++;
        person.add(person);
    }

    public List<Teacher> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teach;
    }
    /**
     * **
     * вызов метода определения среднего возраста
     * @param teachers
     * @return
     */
    static public  double calculateAverageAge(List<Teacher> teachers) {
        AverageAgeCalculator<Teacher> calculator = new AverageAgeCalculator<>(teachers);
        return calculator.calculateAverageAge();
    }
  
    
}
