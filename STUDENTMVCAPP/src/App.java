import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetModelHash;
import Controller.iGetView;
import Controller.iGetViewEngl;
import Model.FileRepo;
import Model.Model;
import Model.ModelHash;
import Model.Student;
import View.View;
import View.ViewEnglish;

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
            Student s8 = new Student("Mihail","Steganov", 41, 188);
            Student s9 = new Student("Roman","Petrov", 24, 112);
            Student s10 = new Student("Masha","Riga", 24, 122);
            Student s11 = new Student("Sergey","Semenov", 24, 235);
            HashMap<Long, Student> students2 = new HashMap<Long, Student>();
            students2.put(s8.getStudentId(), s8);
            students2.put(s9.getStudentId(), s9);
            students2.put(s10.getStudentId(), s10);
            students2.put(s11.getStudentId(), s11);
            
        /**
         * создали модель -список из студентов. Эта конструкция работает с файлом  через интерфейс (архитектурная граница)
         */
        iGetModel model = new Model(students);
        iGetModel modelFileRepo = fileRepo;
        iGetModelHash modelHash = new ModelHash(students2);
        
        /**
         * создаем View для отображения
         */
        iGetViewEngl view = new ViewEnglish();
        
        Controller control = new Controller(view, model, modelHash);
        control.choice();
        // control.updateView();

        
    }

            
    }
