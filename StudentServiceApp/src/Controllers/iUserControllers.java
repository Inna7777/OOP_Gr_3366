package Controllers;

import StudentDomen.User;

/**
 * инерфейс контролера - generic
 */
public interface iUserControllers <T extends User> {
    void create(String firstName, String secondName, int age);
        
}
