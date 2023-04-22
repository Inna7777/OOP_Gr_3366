package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    /**
     * конструктор группы студентов
     * @param students
     */
public StudentGroup(List<Student> students) {
        this.students = students;
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
	

       

    
    
}
