package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * интерфейс для создания общих методов
 */
public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMatket(List<Actor> actors);
    void update();
}
