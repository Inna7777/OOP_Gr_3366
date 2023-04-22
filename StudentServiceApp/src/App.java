import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import StudentDomen.Student;
import StudentDomen.StudentCourse;
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
        List<StudentGroup> listCourse = new ArrayList<StudentGroup>();
        listCourse.add(new StudentGroup(listStud1));
        listCourse.add(new StudentGroup(listStud2));
        listCourse.add(new StudentGroup(listStud3));

        StudentCourse  course = new StudentCourse (listCourse);
            int namber = 1;
		/**
         * Печатаем группу студентов
         */
        // 
        for (StudentGroup group : course) {
            
            System.out.println("Course:" + namber++ );
            for (Student student : group.getStudents()) {
                System.out.println(student.getFirstName() + " "
                 + student.getSecondName()+ " "+student.getAge()+" "+ student.getStudentId());
            }
        }
    



		
        
        
        StudentGroup group = new StudentGroup(listStud1);
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
            }
        
}
        
        
        // System.out.println(group);
        //  listStud.add(s1);
        //  listStud.add(s2);

        
    
    

