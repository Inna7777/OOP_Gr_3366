package StudentDomen;

public class User {
   private String firstName;
   private String secondName;
   private int age;
/**
 * конструктор  класса User
 * @param firstName
 * @param secondString
 * @param age
 */
   public User(String firstName, String secondName, int age){
    this.firstName =firstName;
    this.secondName = secondName;
    this.age = age;
   }
/**
 * Геторы и Сеторы  переменных конструктора
 */
/**
 * метод возвращающий имя
 * @return
 */
public String getFirstName() {
    return firstName;
}
 /**
 * метод позволяющий  задать или изменить имя
 * @param firstName
 */  
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
/**
 * метод возвращающий фамилию
 */
public String getSecondName() {
    return secondName;
}
/**
 * метод позволяющий  задать или изменить фамилию
 * @param secondName
 */

 public void setSecondName(String secondName) {
    this.secondName = secondName;
}
/**
 * метод позволяющий получить возраст
 * @return
 */
public int getAge() {
    return age;
}
/**
 * метод позволяющий  задать или изменить возраст 
 * * @param age
 */
public void setAge(int age) {
    this.age = age;
}


/**
 * переопределение метода toString
 */

@Override
public String toString() {
    return "User ["+ "firstName=" + firstName +'\''
     + ", secondName=" + secondName +
      ", age="+ '\'' + age + "]";
}




    

   
}
