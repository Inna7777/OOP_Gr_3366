package Controllers;

import StudentDomen.Teacher;

import StudentService.TeacherServis;

public class TeacherController implements iUserControllers<Teacher> {
    private final TeacherServis teachService = new TeacherServis();

    @Override
    public void create(String firstName, String secondName, int age) {
        teachService.create(firstName, secondName, age);;
    }
    
}
