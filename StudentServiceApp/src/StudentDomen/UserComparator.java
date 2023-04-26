package StudentDomen;

import java.util.Comparator;
/**
 * создаем класс (generic -обобщённые функции) позволяющий нам сравнивать классы потомков User
 */
/** подключаем интерфейс корпоратора */
public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultofComparing = o1.getFirstName(). compareTo(o2.getFirstName());
        if(resultofComparing == 0)
        {
            resultofComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultofComparing;
        }else{
            return resultofComparing;
        }
    }
}

