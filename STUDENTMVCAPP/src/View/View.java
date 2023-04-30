package View;
import java.util.List;

import Model.Student;

public class View {
  /**
 * создаем простой метод -печати студентов
 */  
public void printAllStudent(List<Student> students)
    {
        for(Student person: students)
        {
            System.out.println(person);
        }
    }
    
}
