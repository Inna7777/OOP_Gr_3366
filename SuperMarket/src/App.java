import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        // Market market = new Market();
        // OrdinaryClient client1 = new OrdinaryClient("Boris ");
        // OrdinaryClient client2 = new OrdinaryClient("Dasha ");
        // SpecialClient client3 = new SpecialClient("Fedor", 1800);

        // market.acceptToMarket(client1);
        // market.acceptToMarket(client2);
        // market.acceptToMarket(client3);
        // market.update();

    Market market = new Market();
    iActorBehaviour item1 = new OrdinaryClient("Boris");   
    iActorBehaviour item2 = new OrdinaryClient("Dasha ");
    iActorBehaviour item3 = new SpecialClient("Fedor ", 1800);
    iActorBehaviour item4 = new PromotClient(" Semen ", 18, "Cупер скидки");
        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.update();
    }
}
