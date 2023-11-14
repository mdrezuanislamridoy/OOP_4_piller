package OOP4Piller.Abstraction.q;

public class circle extends shape{
    circle(double r){
        // this.dim= dim;
        // this.dim2= dim2;
        super(r, r);
        
    }
    void rec(){
            double result=Math.PI*dim*dim2;
            System.out.println(result);
    }
}
