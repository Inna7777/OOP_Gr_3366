package Interfaces;

import Classes.Actor;
/**
 * интерфейс поведения абстрактного клиента в магазине
 */
public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder); //сделать заказ
    void setTakeOrder(boolean takeOrder); //забрать заказ
    void setReturnOrder(boolean returnOrder); //возвратить товар
    /**
     * проверка действий клиента
     */
    boolean isMakeOrder(); 
    boolean isTakeOrder();
    boolean isReturnOrder();
    Actor getActor();
    
}
