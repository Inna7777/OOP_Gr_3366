package StudentService;

import java.util.List;
/**
 * интерфейс -generic для работы со всеми типами  типами сотрудников
 */

public interface iUserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
    
}
