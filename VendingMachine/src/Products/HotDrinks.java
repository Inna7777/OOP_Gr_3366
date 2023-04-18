package Products;

public class HotDrinks extends Product{
         private int volume;
        private int temper;
        private boolean sugar;
        
    
    
        public HotDrinks(String name, Double price, int volume, int temper, boolean sugar) {
        super(name, price);
        this.volume = volume;
        this.temper = temper;
        this.sugar = sugar;
    }
          
    
    public int getVolume()
    {
        return volume;
    }
    public void setVolume(int volume)
    {
        this.volume =volume;
    }


    public int getTemper()
    {
        return temper;
    }
    public void setTemper(int temper)
    {
        this.temper = temper;
    }


    public boolean getSugar()
    {
        return sugar;
    }


    public void setSugar( boolean sugar)
    {
         this.sugar = sugar;
       
    }

    
   /**
    * переопределение вывода продукта
    */
    @Override
    public String toString()
    {
         if( sugar == true)
         {
        return "Product{" + "name=" + super.getName() +
        ", price=" + super.getPrice() + ", volume="+ volume +
        ", temper=" +temper +", "+ "with sugar"+"}";
    }
    else
    return "Product{" + "name=" + super.getName() +
        ", price=" + super.getPrice() + ", volume="+ volume +
        ", temper=" +temper +", "+ "without sugar"+"}";
}
}

