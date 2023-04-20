package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnBehaviour;

/**
 * создаем класс
 */
public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnBehaviour{
    
    // private List<Actor> queue;
    private List<iActorBehaviour> queue;
/**
 * конструктор очереди
 */
        public Market() {
            this.queue = new ArrayList<iActorBehaviour>();
        }

    /**
     * подключение методов из интерфейса iMarketBehaviour
     * @param actor
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+ "клиент пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {  //клиент стал в очередь
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+ "клиент стал в очередь");
        
    }

    @Override
    public void releaseFromMatket(List<Actor> actors) {
        for(Actor actor:actors)
        {
        System.out.println(actor.getName()+ "клиент ушел из магазина");
            queue.remove(actor);
        }
        
    }

    /**
     * подключаем методы из интерфейса iQueueBehaviour(поведение в очереди)
     */
    @Override
    public void update() {
        takeOrder();//вызываем метод -сделал заказ
        giveOrder();//вызываем метод -забрал заказ
        releaseFromQueue();  // метод ухода из магазина      
    }

    @Override
    public void giveOrder() {
    for(iActorBehaviour actor: queue)
    {
        if(actor.isMakeOrder())
        {
            actor.setTakeOrder(true);
            System.out.println(actor.getActor().getName()+" клиент получил свой заказ");
        }
    }
        
    }

    @Override
    public void releaseFromQueue() {
      List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor:queue)
        {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+ "клиент ушел из очереди");
            }
        }
    releaseFromMatket(releaseActors);
    }



    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+ "клиент сделал свой заказ");
            }
        }
    }
    /**
     * подключение методов из интерфейса iReturnBehaviour (поведение при возврате товара)
     * @param actor
     */
    @Override
    public void returnToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+ "клиент вернулся в  магазин");
        takeInQueue(actor);
        }

    @Override
    public void returnPurche(iActorBehaviour actor) {
        if(!actor.isReturnOrder()){
            actor.setReturnOrder(true);
            System.out.println(actor.getActor().getName()+" клиент вернул товар");
            }
        }
        
    @Override
    public void leaveShop(iActorBehaviour actor) {
        if (actor.isReturnOrder())
        {
            actor.setReturnOrder(true);
            System.out.println(actor.getActor().getName()+" клиент  покинул магазин"); 
        }
    }
        

    @Override
    public void updateReturn(iActorBehaviour actor) {
        returnToMarket(actor);
        returnPurche(actor);
        leaveShop(actor);

    }


}

   
    

