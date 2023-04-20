package Interfaces;
/**
 * интерфейс возврата товара
 */
public interface iReturnBehaviour {
    void returnToMarket(iActorBehaviour actor);//возвращается в магазин
    void returnPurche(iActorBehaviour actop);//возвращает товар
    void leaveShop(iActorBehaviour actor);//покинуть магазин 
    void updateReturn(iActorBehaviour actor);
    
}