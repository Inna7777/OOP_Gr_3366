package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder); //сделать заказ
    void setTakeOrder(boolean takeOrder); //забрать заказ
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
    
}
