import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
// import StudentDomen.User;


public class App {

    public static void main(String[] args) throws Exception {
        // User u1 =new User("Boris", "Borisov", 25);
        Student s1 = new Student("Sergey","Ivanov", 24, 180);
        Student s2 = new Student("Michail","Petrov", 25, 111);
        Student s3 = new Student("Dasha","Rideeva", 41, 123);
        Student s4 = new Student("Sergey","Semenov", 24, 234);
        Student s5 = new Student("Michail","Petrov", 25, 151);
        Student s6 = new Student("Lena","Medvedeva",25, 723);
        Student s7 = new Student("Petr","Semenov", 28, 634);
        /**
         * добавляем студентов в список
         */
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        listStud.add(s7);
        /**
         * Печатаем группу студентов
         */
        StudentGroup group = new StudentGroup(listStud);
        for(Student stud: group)
                {
                    System.out.println(stud);
                }
                System.out.println("+++++++++++++++++ после сортировки ++++++++++++++++++++++++");
        Collections.sort(group.getStudents());
        for(Student stud: group)
                {
                    System.out.println(stud);
                }
        
        
        // System.out.println(group);
        //  listStud.add(s1);
        //  listStud.add(s2);

        
    
    }
}
