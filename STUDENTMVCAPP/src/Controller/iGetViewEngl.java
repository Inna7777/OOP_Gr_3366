package Controller;
import java.util.List;

import Model.Student;
// создаем интерфейс для разрыва связи (архитектурная граница) 
public interface iGetViewEngl {
    void printAllStudent(List<Student> students);
    String prompt(String message);
}
