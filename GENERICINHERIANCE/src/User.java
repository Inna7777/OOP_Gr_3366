/**
 * создаем класс generic < > с указанием сколько
 * типов понадобится для нащего класса
 */

public class User <T,V> {
   private T firstName;
   private T secondName;
   private V age;
/**
 * конструктор  класса User
 * @param firstName
 * @param secondString
 * @param age
 */
   public User(T firstName, T secondName, V age){
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
public T getFirstName() { //меняем  String на T, а int на V
    return firstName;
}
 /**
 * метод позволяющий  задать или изменить имя
 * @param firstName
 */  
public void setFirstName(T firstName) {
    this.firstName = firstName;
}
/**
 * метод возвращающий фамилию
 */
public T getSecondName() {
    return secondName;
}
/**
 * метод позволяющий  задать или изменить фамилию
 * @param secondName
 */

 public void setSecondName(T secondName) {
    this.secondName = secondName;
}
/**
 * метод позволяющий получить возраст
 * @return
 */
public V getAge() {
    return age;
}
/**
 * метод позволяющий  задать или изменить возраст 
 * * @param age
 */
public void setAge(V age) {
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
