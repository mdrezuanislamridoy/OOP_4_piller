package OOP4Piller.PolyMorphism;

import project1.result;

public class polyCk extends poly{

    // overriding

    // int c;
    // @Override
    // void display() {
    //     // TODO Auto-generated method stub
    //     super.display();
    //     System.out.println(c);
    // }

    // double base,height;

    // polyCk(double base,double height){
    //     this.base= base;
    //     this.height=height;
        
    // }
    // @Override
    // double Shape(){
    //     return 0.5*base*height;
    // }

    //Run time polymorphism
    // void display(){
    //     System.out.println("hooooo");
    // }


    // poly shape

    double leng;
    double widt;
    polyCk(double leng, double widt){
        this.leng= leng;
        this.widt= widt;
    }

    double area(){
        return leng*widt;
    }
}
