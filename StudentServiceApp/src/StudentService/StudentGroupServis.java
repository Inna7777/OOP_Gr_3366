package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

public class StudentGroupServis {
    private List<StudentGroup> groups;
    public StudentGroupServis()
    {
        this.groups = new ArrayList<>();
        
    }
    /**
     * mетод возврата всех групп
     */
    public List<StudentGroup> getAll()
    {
        return this.groups;
    }
    /**
     * cоздаем метод корпорататора добавления и сортировки  группы студентов
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }






}
