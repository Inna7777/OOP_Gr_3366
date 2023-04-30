package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/**
 * создаем класс, который будет работать с файлами
 */
public class FileRepo implements iGetModel {
    private String fileName;
    private List<Student> students;
    /**
     * создаем конструктор для работы с файлом
     */
    public FileRepo(String fileName)  {
        this.fileName = fileName;
        this.students = new ArrayList<>();
    // проверяем можем ли мы получить доступ к файлу (отлавливаем ошибки)
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
     *метод заполнения хранилища
     */
    public void addStudent(Student student)
    {
        this.students.add(student);
    }
    /**
     * метод считывания студентов
     */
     public void readAllStudentsFromFile()
     {
        try {
            File file = new File(fileName);//создаем файл
            FileReader fr = new FileReader(file); // подключаемся и  читаем файл
            BufferedReader reader = new BufferedReader(fr);//соединяемся с файлом;
            String line = reader.readLine(); // построчно считываем файл
            while(line != null) //проверка подключения
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0],param[1], Integer.parseInt(param[2]),Long.parseLong(param[3]));  
                students.add(pers);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
     /**
      * метод сохранения файла
      */
     public void saveAllStudentToFile()
     {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers: students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getStudentId());
                fw.append('\n');// перевод строки
            }
             
            fw.flush();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
   }
    @Override
    public List<Student> getAllStudents() {
        readAllStudentsFromFile();
        return students;
    }

    
    
    
}

