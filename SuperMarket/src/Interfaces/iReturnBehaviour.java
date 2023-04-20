package Interfaces;

public interface iReturnBehaviour {
    void returnToMarket(iActorBehaviour actor);//возвращается в магазин
    void returnPurche();//возвращает товар
    void updateReturn(); //объединяет методы поведения при возврате товара
   
}