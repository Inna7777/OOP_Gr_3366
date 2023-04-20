package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder); //сделать заказ
    void setTakeOrder(boolean takeOrder); //забрать заказ
    void setReturnOrder(boolean returnOrder); //возвратить товар
    boolean isMakeOrder();
    boolean isTakeOrder();
    boolean isReturnOrder();
    Actor getActor();
    
}
