package Classes;
/**
 * Класс клиентов покупающих по акции
 */

public class PromotClient extends Actor{
    private int idShare;
    private String nameShare;
    /**
     * конструктор класса Акционного клиента
     * @param name
     * @param idShare
     * @param nameShare
     */

    public PromotClient(String name, int idShare, String nameShare)
    {
        super(name);
        this.idShare = idShare;
        this.nameShare =nameShare;

    }
    /** 
     * методы из интерфейса aбстрактного класса
     */
    @Override
    public String getName() {
        return super.name;
    }

    public int getidShare()
    {
        return idShare;
    }

    public String nameString()
    {
        return nameShare;
    }

    @Override
    public Actor getActor() {
        return this;
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
        super.isTakeOrder = takeOrder; 
    }
    /**
    *  методы из интерфейса iReturnBehaviour возврата товара 
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