import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       /**
        * Создаем студента, где и указываем типы которые собираемся использовать
        */
       Student<String,Integer,Long> s1 = new Student<String,Integer,Long>("Сергей", "Иванов",23, (long)101); // Long  с большой буквы, потому что примитивные типы в нутри дженирика использовать нельзя
        
        System.out.println(s1);
        Student<String,Integer,Long> s2 = new Student<String,Integer,Long>("Матвей", "Селиванов",24, (long)102);  
        Student<String,Integer,Long> s3= new Student<String,Integer,Long>("Матвей", "Селиванов",24, (long)102);
        /**
       * Создаем список студентов
       */
          List<Student<String,Integer,Long>> listStud = new ArrayList<>();
          listStud.add(s1);
          listStud.add(s2);
          listStud.add(s3);
          /**
           *Создаем группу студентов
           */
        StudentGroup<String, Integer, Long> group = new StudentGroup<String,Integer,Long>(listStud, null);
          for(Student<String, Integer, Long> stud: group ) //  используем Comparable
          {
            System.out.println(stud);
          }
          Collections.sort(group.getStudents());

          }
 }
