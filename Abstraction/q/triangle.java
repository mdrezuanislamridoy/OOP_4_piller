package OOP4Piller.Abstraction.q;

public class triangle extends shape{
    triangle(double dim,double dim2){
        // this.dim= dim;
        // this.dim2= dim2;
        super(dim, dim2);
        
    }
    void rec(){
            double result=0.5* dim*dim2;
            System.out.println(result);
    }
    
}
