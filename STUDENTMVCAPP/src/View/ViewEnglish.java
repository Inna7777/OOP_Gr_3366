package View;

import java.util.List;
import java.util.Scanner;


import Controller.iGetViewEngl;
import Model.Student;

public class ViewEnglish implements iGetViewEngl {
        public void printAllStudent(List<Student> students)
    {
        System.out.println("---------Displaying a list of students------------");
        for(Student person: students)
        {
            System.out.println(person);
        }
        System.out.println("---------End of list------------");
    }
    /**
     *  этот метод считывает команды с консоли и добавляем этод метод в интерфейс View
     */
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public long promptLong(String message) {
        Scanner id = new Scanner(System.in);
        System.out.print(message);
        return Long.parseLong(id.nextLine());
    }
}


