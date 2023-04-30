package View;
import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView { // подключаем интерфейс
  /**
 * создаем простой метод -печати студентов
 */  
public void printAllStudent(List<Student> students)
    {
        System.out.println("---------Вывод списа студентов------------");
        for(Student person: students)
        {
            System.out.println(person);
        }
        System.out.println("---------Конец списка------------");
    }
    /**
     *  этот метод считывает команды с консоли и добавляем этод метод в интерфейс View
     */
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
