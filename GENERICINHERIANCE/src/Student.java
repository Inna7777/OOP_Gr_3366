
 /**
  * класс Student наследуется от User поэтому
  надо указать у User типы<T,V>, студент тоже становиться обобщенным калассом
  */
public class Student <T,V,S extends Comparable <S>> extends User <T,V> implements Comparable<Student<T,V,S>> {
       private S studentId;
       /**
        * добавляем конструктор, где передаем поля из класса User
        * @param firstName
        * @param secondName
        * @param age
        * @param studentId
        */

       public Student(T firstName, T secondName, V age, S studentId)
       {
              super(firstName, secondName, age);
              this.studentId = studentId;
       }
       
       /**
        * метод позволяющий получить ID студента
        * @return
        */
         public S getStudentId() {
              return studentId;
       }
       /**
        * метод позволяющий задать ID студента
        * @param studentId
        */
       public void setStudentId(S studentId) {
              this.studentId = studentId;
       }
       /**
       переопределение метода вывода на экран   */

       /**
        *  В toString ничего не меняем, он остается для автоматического вывода
        */
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
	public int compareTo(Student<T,V,S> o) {
              return this.studentId.compareTo(o.studentId);
       }      
    
}
