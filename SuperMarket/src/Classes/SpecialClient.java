package Classes;
/**
 * Класс Vip клиент подключаем к абстрактному классу Actor
 */
public class SpecialClient extends Actor{   
     private int idVIP;
     /**
      * Конструктор класса Vipклиента c полями имя и id-карта
      * @param name
      * @param idVIP
      */    
     public SpecialClient(String name, int idVIP){   
     super(name);  
     this.idVIP = idVIP;
    }  
    /**
     * переопределен метода из абстрактного класса
     */
    @Override 
     public String getName() {  
        return super.name;   
    }    
    /**
     * создаем метод возврата idVip
     * @return
     */
     public int getIdVIP() {   
         return idVIP;  
    }
    /**
     * переопределен методы из абстрактного класса
     */
     
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

    /**
     * переопределен метода из интерфейса возврата товара
     */
    @Override
    public void setReturnOrder(boolean returnOrder) {
       super.isReturnOrder = returnOrder;
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    
  }
