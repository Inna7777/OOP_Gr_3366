package Controller;

import java.util.ArrayList;
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
    // подключаем к контроллеру интерфейсы
    private iGetView view;
    private  iGetModel model;

/**
 * Создаем конструктор Controller-а
 * @param view
 * @param model
 */
public Controller(iGetView view, iGetModel model){
    this.view = view;
    this.model = model;
    this.students =new ArrayList<Student>();
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
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration =true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
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
            }
        }
    }


}
