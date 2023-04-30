

import java.util.Iterator;
import java.util.List;
/**
 * класс StudentGroup - организация обработки данных(Itrerable <Student), подключаем метод сортировки (implements Comparable)
 */
public class StudentGroup <T,V, S extends Comparable<S>> implements Iterable<Student< T,V,S>> {
    private V course;
    private List<Student<T,V, S>> students;
    
    /**
     * конструктор группы студентов
     * @param students
     */
public StudentGroup(List<Student <T,V, S>> students, V course) {
        this.students = students;
        this.course = course;
    }

    /**
     * задаем номер курса
     * @param course
     */
    public void setCourse(V course) {
        this.course = course;
    }

    /**
     * возвращаем номер курса
     * @return
     */
    public V getCourse() {
        return course;
    }


    /**
     * метод возврата списка студента
     * @return
     */
 public List<Student<T,V, S>> getStudents() {
        return students;
    }
    /**
     * метод изменения списка студентов
     * @param students
     */
        public void setStudents(List<Student<T,V, S>> students) {
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
	public Iterator<Student <T,V, S>> iterator() {
		return new  Iterator<Student<T,V, S>>() {
            private int  index = 0;
            @Override
            public boolean hasNext() {
               return index <students.size();
            }
            @Override
            public Student<T,V, S> next() {
                if(!hasNext())
                {
                    return null;
                }
                // counter++;
                return students.get(index++);        
            }
        };
	}

    // @Override
    // public int compareTo(StudentGroup o) {
    //     if(this.getCourse() == o.getCourse())
    //           {
    //              return 0;
    //           }
    //           if (this.getCourse() < o.getCourse())
    //           {
    //                  return -1;
    //           }
    //           return 1;
    //    }

}

    

       

    
    

