package Controller;
import java.util.List;

import Model.Student;

// создаем интерфейс для разрыва связи (архитектурная граница) 
public interface iGetModel {
    public List<Student> getAllStudents();

}
