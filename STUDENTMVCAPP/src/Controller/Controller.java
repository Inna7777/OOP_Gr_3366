package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.View;
/**
 *  объявляем View и Мodel в Controller для хранения
 */
public class Controller {
    private  List<Student> students;
    private HashMap<Long, Student> students2;
    // подключаем к контроллеру интерфейсы
    private iGetViewEngl view;
    private  iGetModel model;
    private iGetModelHash modelHash;
    

/**
 * Создаем конструктор Controller-а
 * @param view
 * @param model
 */
public Controller(iGetViewEngl view, iGetModel model, iGetModelHash modelHash){
    this.view = view;
    this.model = model;
    this.modelHash = modelHash;
    this.students =new ArrayList<Student>();
    this.students2 = new HashMap<Long, Student>();
}
/**
 * создаем два метода для реализации модели MVP
 */ // берет из модели и кладет в внутрь контроллера
public void getAllStudents() 
{
    students = model.getAllStudents();
}
public boolean testData()
{
   if(students.size()>0)
   {
    return true;
   }
   else{
    return false;
   }
}
/**
 * создаем два метода для реализации модели MVP
 */ // берет из модели и кладет в внутрь контроллера
 public void getAllStudentsHash() 
 {
     students2 = modelHash.getAllStudentsHash();
 }
 public boolean testData2()
 {
    if(students2.size()>0)
    {
     return true;
    }
    else{
     return false;
    }
 }
 
/**
 * создаем метод, котрый свяжет View and Model 
 * метод берет модель и запрашивает всех студентов
 */
public void updateView()
{
    //MVP
    getAllStudents();// загрузили данные к себе в память
    if(testData()) // проверили полученные данные
    {
        view.printAllStudent(students); // отправляем View для отображения
    }
    else{
        System.out.println("список студентов пуст!");
    }
    //MVS
    // view.printAllStudent(model.getAllStudents());
    }
    public void updateViewMap()
    {
        //MVP
        getAllStudentsHash();// загрузили данные к себе в память
        if(testData2()) // проверили полученные данные
        {
            view.printAllStudentMap(students2); // отправляем View для отображения
        }
        else{
            System.out.println("список студентов пуст!");
        }
        //MVS
        // view.printAllStudent(model.getAllStudents());
        }
    
    /** метод -сценария работы программы */

    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration =true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            try{
                com = Commands.valueOf(command.toUpperCase());
            }catch(Exception e)
            {
                com = Commands.UPDATE;
            }
            long id;
            switch(com)
            {
                case EXIT:
                getNewIteration=false;
                System.out.println("Выход из программы");
                break;
                case LIST:
                getAllStudents();
                updateView();
                break;
                case DELETE:
                id = view.promptLong("Введите id студента для удаления:");// запрашиваем у пользователя ID студента для удаления
                deleteStudentById(id);// вызываем метод deleteStudentById с полученным ID в качестве аргумента
                updateView();// обновляем представление
                break;// завершаем выполнение команды "удалить"
                default:// в случае любой другой команды
                System.out.println("Неверная команда");// выводим сообщение об ошибке
                break;// завершаем выполнение команды
            }
            
        }
    }

    /** метод удаления студента по id */
    public void deleteStudentById(long id) {
        getAllStudents();//вызываем список студентов
        for (Student student : students) {//перебираем список студентов
          if (student.getStudentId() == id) {//если найден заданный id
            students.remove(student);//удаляем
            break;//завершаем
          }
        }
      } 
    
   
 }
        
    
        
    

