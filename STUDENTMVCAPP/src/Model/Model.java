package Model;
/**
 * создаем модель- список студентов
 */

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel{//подключаем интерфейс
     private List<Student> students;
/**
 * создаем контсруктор для создания списка студентов
 * @param students
 */
     public Model(List<Student> students) {
          this.students = students;
     }
/**
 * мотод предоставления данный о студентах
 */
     public List<Student> getAllStudents()
     {
          return students;
     }
     
}
