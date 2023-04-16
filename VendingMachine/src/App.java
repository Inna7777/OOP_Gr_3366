import Products.BottleOfWater;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Colla");
        item1.setPrice(98.0);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Кола", 88.90, 500));
        itemMachine.addProduct(new BottleOfWater("Вода", 28.90, 300));
        
        
        for(Product prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }

        
    }
}
