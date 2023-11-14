package OOP4Piller.Abstraction;

public abstract class abst {
    // point to be remember about abstract method
    // 
    // Abstract method has no body
    // it must be written in abstract class
    // it must be ends with semi colon ;
    // it must be overriden
    // it cannot be final or static


    //abstract class can have abstract or non abstract method
    // anstract class can be 0-100% abstraction
    // abstract class cannot create object;
    // it can create reference variable


    /*
     *  ex
     * abstract  class mobileUser{
     *  abstract void send();
     * }
     * 
     * 
     * class re extends mobileUser{
     *      @override
     *      void send(){
     *          syso("this is re");
     * }
     * }
     * 
     * 
     * class m{
     * psvm(){
     *  mobileUser mu;
     * mu = new re();
     * 
     * }
     * }
     */




     //////         practical



    abstract void sendM();
}
