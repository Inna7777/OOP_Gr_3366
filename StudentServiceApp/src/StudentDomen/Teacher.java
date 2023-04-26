package StudentDomen;
/**
 * coздаем класс учителей наследуемый от User
 * @param firstName
 * @param secondString
 * @param age
 */
public class Teacher extends User {
   private int teacherID;
   private String academicDegree;
   public Teacher(String firstName, String secondName, int age, int teacherID, String level) {
        super(firstName, secondName, age);
        this.teacherID = teacherID;
        this.academicDegree = level;      
        
    }
public int getTeacherID() {
    return teacherID;
}
public String getLevel() {
    return academicDegree;
}
public void setTeacherID(int teacherID) {
    this.teacherID = teacherID;
}
public void setLevel(String level) {
    this.academicDegree = level;
}


     
}
