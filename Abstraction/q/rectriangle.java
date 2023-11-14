package OOP4Piller.Abstraction.q;

public class rectriangle extends shape{

    rectriangle(double dim,double dim2){
        // this.dim= dim;
        // this.dim2= dim2;
        super(dim, dim2);
        
    }
    void rec(){
            double result= dim*dim2;
            System.out.println(result);
    }
    
}
