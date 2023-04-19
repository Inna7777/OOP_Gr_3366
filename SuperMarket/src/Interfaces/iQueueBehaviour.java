package Interfaces;


/**
 * интерфейс очереди
 */
    public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor); //стать в очередь
    void releaseFromQueue(); // удалить из очереди
    void takeOrder(); //забрать заказ
    void giveOrder(); //сделать заказ
    }

