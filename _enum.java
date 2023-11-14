
enum Laptop {
    MAC,HP,ASUS,LENOVO;
}



public class en1 {
    public static void main(String[] args) {
        Laptop lap = Laptop.ASUS;
        System.out.println(lap);

        // if else 

        System.out.println();

        if (lap==Laptop.HP) {
            System.out.println("Hp");
        }else if(lap==Laptop.ASUS){
            System.out.println("asus");
        }

        // switch break

    System.out.println();

        switch (lap) {
            case ASUS :
                System.out.println("ass");
                break;
            case MAC:
                System.out.println("mac");
            default:
                System.out.println("nothing");
                break;
        }
        // loop

        System.out.println();

        for (Laptop l : lap.values()) {
            System.out.println(l);
        }

System.out.println();

        Prices p= Prices.Mac;

        for (Prices pr : p.values()) {
            System.out.println(pr + " : "+ pr.getPrice());
        }
    }
}

enum Prices{
    Mac(2222),Asus(3453),xp(4355),windows(4543),pkr;

    private Prices(){
        price = 4999;
    }
    private int price;

    private Prices(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
