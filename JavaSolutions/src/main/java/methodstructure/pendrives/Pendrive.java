package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent){
        this.price += price * ((percent / 100.0));
    }

    public int comparePricePerCapacity(Pendrive penOther){
        if((double)penOther.price/penOther.capacity < (double)this.price/this.capacity){
            return 1;
        }
        else if ((double)penOther.price/penOther.capacity > (double)this.price/this.capacity){
            return -1;
        }
        return 0;
    }
    public boolean cheaperThan(Pendrive penOther){ return this.price < penOther.price;}

    @Override
    public String toString() {
        return "Pendrive adatai: " +
                "name= '" + name + '\'' +
                ", capacity= " + capacity +
                ", price= " + price;
    }
}
