package OOP4Piller.Abstraction.q;



public abstract class shape {
    double dim ,dim2;
    shape(double dim,double dim2){
        this.dim= dim;
        this.dim2= dim2;
    }
    abstract void rec();
}
