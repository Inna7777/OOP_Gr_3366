package Model;

import java.util.HashMap;



import Controller.iGetModelHash;

public class ModelHash implements iGetModelHash {
    private HashMap<Long, Student> students2;


    public ModelHash(HashMap<Long, Student> students2) {
        this.students2 = students2;
   }
   
   public  HashMap<Long, Student> getAllStudentsHash() {
        return students2;
   }


}
   
    

