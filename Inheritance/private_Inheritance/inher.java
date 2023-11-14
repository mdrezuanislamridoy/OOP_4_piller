package OOP4Piller.Inheritance.private_Inheritance;

public class inher extends person {
    private int phone;

    public void setphone(int phone) {
        this.phone = phone;
    }

    public int getphone() {

        return phone;
    }
    void display(){
        System.out.println(getname());
        System.out.println(getcountry());
        System.out.println(phone);
    }
}
