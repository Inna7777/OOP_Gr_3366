import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Пишем список студентов
         */
        
        List<Student> students= new ArrayList<Student>();
        Student s1 = new Student("Sergey","Ivanov", 41, 180);
        Student s2 = new Student("Oleg","Vetrov", 24, 111);
        Student s3 = new Student("Dasha","Rideeva", 24, 123);
        Student s4 = new Student("Sergey","Semenov", 24, 234);
        Student s5 = new Student("Michail","Petrov", 24, 151);
        Student s6 = new Student("Lena","Medvedeva",25, 723);
                students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s5);
        students.add(s6);

        FileRepo fileRepo = new FileRepo("StudentDb.txt");// создаем файл
            // for(Student pers : students)
            //         {
            //             fileRepo.addStudent(pers);
            //         }
            //         fileRepo.saveAllStudentToFile();
        //  /**
        //  * создали модель -список из студентовЭта модель работает с памятью конструктора.
        //  */
        // Model model = new Model(students);
        // /**
        //  * создаем View для отображения
        //  */
        // View view =new View();
        // /*
        //  *создаем Controller  и передаем ему View и Model
        //  */
        // Controller control = new Controller(view, model);
        // control.updateView();
               
        /**
         * создали модель -список из студентов. Эта конструкция работает с файлом  через интерфейс (архитектурная граница)
         */
        iGetModel model = new Model(students);
        iGetModel modelFileRepo = fileRepo;
        
        /**
         * создаем View для отображения
         */
        iGetView view =new View();
        Controller control = new Controller(view, modelFileRepo);
        control.run();
        // control.updateView();
    }
}
