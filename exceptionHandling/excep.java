package OOP4Piller.exceptionHandling;

import java.util.Scanner;

public class excep {

    public static void main(String[] args) {

        // try {
        // int x = 0;
        // int y = 5;
        // int reg = y / x;
        // System.out.println(reg);

        // } catch (Exception e) {
        // System.out.println("exception : "+ e);

        // }finally{
        // System.out.println("cannot ");
        // }

        // try {
        // int[] a = new int[5];
        // a[6] = 55;
        // System.out.println(a[6]);

        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // question

        int c= 1;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a / b);
                c= 2;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("please try again");
                
            }
            
        }while(c==1);

    }
}
