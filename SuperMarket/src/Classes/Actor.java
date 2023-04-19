package Classes;

import Interfaces.iActorBehaviour;
/**
 * создаем абстрактный класс
 */
public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
/**
 * Конструктор имени
 * @param name
 */   
    public Actor(String name) {
        this.name = name;
    }

/**
 * Абстактный метод для получения имени.
 * @return
 */
    public abstract String getName();


}
