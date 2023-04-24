package StudentDomen;

import java.util.Iterator;
import java.util.List;
/**
 * класс StudentGroup - организация обработки данных(Itrerable <Student), подключаем метод сортировки (implements Comparable)
 */
public class StudentGroup  implements Iterable<Student> , Comparable<StudentGroup> {
    private int course;
    private List<Student> students;
    
    /**
     * конструктор группы студентов
     * @param students
     */
public StudentGroup(List<Student> students, int course) {
        this.students = students;
        this.course = course;
    }

    /**
     * задаем номер курса
     * @param course
     */
    public void setCourse(int course) {
        this.course = course;
    }

    /**
     * возвращаем номер курса
     * @return
     */
    public int getCourse() {
        return course;
    }


    /**
     * метод возврата списка студента
     * @return
     */
 public List<Student> getStudents() {
        return students;
    }
    /**
     * метод изменения списка студентов
     * @param students
     */
        public void setStudents(List<Student> students) {
        this.students = students;
    }

   
    /**
     * создаем класс итератора  и подключаем его сюда
     */
	// @Override
	// public Iterator<Student> iterator() {
	// 	return new  StudentGroupIterator(students);
	// }

    

    /**
     * анонимный iterator,  тогда не надо создавать класс StudentGroupIterator
     */
	@Override
	public Iterator<Student> iterator() {
		return new  Iterator<Student>() {
            private int  index = 0;
            @Override
            public boolean hasNext() {
               return index <students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                // counter++;
                return students.get(index++);        
            }
        };
	}

    @Override
    public int compareTo(StudentGroup o) {
        if(this.getCourse() == o.getCourse())
              {
                 return 0;
              }
              if (this.getCourse() < o.getCourse())
              {
                     return -1;
              }
              return 1;
       }

}

    

       

    
    

