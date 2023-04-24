package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentCourse implements Iterable<StudentGroup>{
    private  List<StudentGroup> courses;
    
   
 /**
  * конструктор потоков студентов(список курсов )
  * @param courses
  */   
public  StudentCourse(List<StudentGroup> courses) {
        this.courses = courses;
    }
/**
 * возвращаем значание 
 * @return
 */
public List<StudentGroup> getCourses() {
	return courses;
}

public void setCourses(List<StudentGroup> courses) {
	this.courses = courses;
}

	/**
	 * подключение анонимного iterator -а для перебора в цикле for группы студентов
	 *   
	 * */
@Override
public Iterator<StudentGroup> iterator() {
	return new Iterator<StudentGroup>() {
        private int index = 0;
		@Override
		public boolean hasNext() {
			return index < courses.size();
		}
		@Override
		public StudentGroup next() {
			if(!hasNext())
            {
			return null;
            }
            return courses.get(index++);
		}
        
        
    };
}

}
