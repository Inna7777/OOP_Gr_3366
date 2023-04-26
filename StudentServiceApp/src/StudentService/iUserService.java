package StudentService;

import java.util.List;
/**
 * интерфейс -generic для работы со всеми типами данных
 */

public interface iUserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
    
}
