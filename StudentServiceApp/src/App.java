import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentCourse;
import StudentDomen.StudentGroup;
// import StudentDomen.User;
import StudentDomen.Teacher;


public class App {

    	public static void main(String[] args) throws Exception {
        // User u1 =new User("Boris", "Borisov", 25);
        Student s1 = new Student("Sergey","Ivanov", 41, 180);
        Student s2 = new Student("Oleg","Vetrov", 24, 111);
        Student s3 = new Student("Dasha","Rideeva", 24, 123);
        Student s4 = new Student("Sergey","Semenov", 24, 234);
        Student s5 = new Student("Michail","Petrov", 24, 151);
        Student s6 = new Student("Lena","Medvedeva",25, 723);
        Student s7 = new Student("Petr","Semenov", 28, 634);
        Student s8 = new Student("Masha","Smirnova", 22, 161);
        Student s9 = new Student("Luda","Vasileva",25, 723);
        Student s10 = new Student("Semen","Smirnov", 21, 434);
        Student s11 = new Student("Oksana","Fedorova", 25, 934);
        /**
         * добавляем студентов в списки групп
         */
        
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s7);
        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s8);
        listStud4.add(s9);
        List<Student> listStud5 = new ArrayList<Student>();
        listStud5.add(s10);
        listStud5.add(s11);
        
        List<StudentGroup> listCourse = new ArrayList<StudentGroup>();
        listCourse.add(new StudentGroup(listStud1, 2));
        listCourse.add(new StudentGroup(listStud2, 1));
        listCourse.add(new StudentGroup(listStud3, 4));
        listCourse.add(new StudentGroup(listStud4, 3));
        listCourse.add(new StudentGroup(listStud5, 5));
            /**
            * Печатаем  студентов на курсе (1,2,3,4,5)
            */
            StudentCourse course = new StudentCourse(listCourse);
            Collections.sort(course.getCourses()); // сортируем курсы по номеру
            for (StudentGroup group :course.getCourses()) { // проходимся по каждой группе в каждом курсе
                System.out.println("Course:" + group.getCourse() ); // выводим номер курса
           
                Collections.sort(group.getStudents()); // сортируем студентов в группе 
                for (Student student : group.getStudents()) { // проходимся по каждому студенту в группе
                    System.out.println(student); // выводим на печать группу и студента в ней
                }
            }
            //сотрудники 
            Emploee person1 = new Emploee("Иванов", "Олег",55, 110);
            Student s12 = new Student("Sergey","Ivanov", 41, 180);
            Teacher person1_2 = new Teacher("Кузьмин", "Борис",60, 0201, "PhD");
            // EmploeeController contrEmp = new EmploeeController();
                     
            EmploeeController.paySalary(person1);
            // EmploeeController.paySalary(person1_2);
            
            Integer studHour[] = {124,45,34,124,67}; // часы студентов
            System.out.println(EmploeeController.mean(studHour));//вызываем метод - jenerik

            Double emplSalary[] = {12556.7,34543.0,10000.0};
            System.out.println(EmploeeController.mean(emplSalary));

        }

    }
    

        
        
    
    

