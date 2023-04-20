package Classes;

public class OrdinaryClient extends Actor{
/**
 * вызываем конструктор из абстрактного класса
 */
     public OrdinaryClient(String name)
     {
        super(name);
     }
/**
 * вызываем метод из абстрактного класса
 */
   @Override
   public String getName() {
      return super.name;
   }

/** 
 * методы из интерфейса aбстрактного класса
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
   super.isTakeOrder = takeOrder;
   
}
@Override
public Actor getActor() {
      return this;
}
/**
 * * методы из интерфейса iReturnBehaviour возврата товара 
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
