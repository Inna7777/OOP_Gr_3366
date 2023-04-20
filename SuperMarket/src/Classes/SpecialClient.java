package Classes;
/**
 * Класс Vip клиент
 */
public class SpecialClient extends Actor{   
     private int idVIP;
     /**
      * Конструктор класса Vipклиента
      * @param name
      * @param idVIP
      */    
     public SpecialClient(String name, int idVIP){   
     super(name);  
     this.idVIP = idVIP;
    }  

    @Override 
     public String getName() {  
        return super.name;   
    }    

     public int getIdVIP() {   
         return idVIP;  
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
      super.isMakeOrder = takeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }
    @Override
    public void setReturnOrder(boolean returnOrder) {
       super.isReturnOrder = returnOrder;
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    
  }
