package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import Model.Model;
import Model.Student;

public class Controller {
    private  List<Student> students;
private View  view;
private  Model model;

public Controller(View view, Model model){
    this.view = view;
    this.model = model;
    this.students =new ArrayList<Student>();

}

public void updateView()
{
    students = model.getAll
}



}
