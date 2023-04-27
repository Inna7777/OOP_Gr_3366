package StudentDomen;
/**
 * coздаем класс учителей наследуемый от User
 * @param firstName
 * @param secondString
 * @param age
 */
public class Teacher extends User {
   private int teacherID;
   private String academicDegree;// ученая степень
   public Teacher(String firstName, String secondName, int age, int teacherID, String academicDegree) {
        super(firstName, secondName, age);
        this.teacherID = teacherID;
        this.academicDegree = academicDegree;      
        
    }
public int getTeacherID() {
    return teacherID;
}
public String getacademicDegree() {
    return academicDegree;
}
public void setTeacherID(int teacherID) {
    this.teacherID = teacherID;
}
public void setLevel(String academicDegree) {
    this.academicDegree = academicDegree;
}


     
}
