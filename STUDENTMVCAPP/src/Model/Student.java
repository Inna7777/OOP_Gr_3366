package Model;
/**
 * класс Student наследуем от User и подключаем метод сортировки (implements Comparable)
 */
public class Student extends User implements Comparable<Student> {
       private long studentId;
       /**
        * добавляем конструктор, где передаем поля из класса User
        * @param firstName
        * @param secondName
        * @param age
        * @param studentId
        */

       public Student(String firstName, String secondName, int age, long studentId)
       {
              super(firstName, secondName, age);
              this.studentId = studentId;
       }
       
       /**
        * метод позволяющий получить ID студента
        * @return
        */
         public long getStudentId() {
              return studentId;
       }
       /**
        * метод позволяющий задать ID студента
        * @param studentId
        */
       public void setStudentId(long studentId) {
              this.studentId = studentId;
       }
       /**
       переопределение метода вывода на экран   */
       @Override
       public String toString() {
           return "Student{" 
                   
                   +"firstName=" +super.getFirstName()
                   +", secondName=" +super.getSecondName()
                   +", age=" +super.getAge()+
                   ", studentID=" + studentId +
                   '}';
       }
       /**
        * подключенный метод сортировки
        */
	@Override
	public int compareTo(Student o) {
              // вызываем параметры для сортировки и пишем условия  
                  
		if(this.getAge() == o.getAge())
              {
                 if(this.studentId== o.studentId)
                     {
                            return 0;
                     }
                     if(this.studentId< o.studentId)
                     {
                            return -1;
                     }        
                  return 1;
              }
              if (this.getAge() < o.getAge())
              {
                     return -1;
              }
              return 1;
       }

      
    
}
