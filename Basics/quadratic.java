import java.util.*;

public class quadratic {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the coefficients of x^2 ");
        a=s.nextInt();
        System.out.println("Enter coefficient of x: ");
        b=s.nextInt();
        System.out.println("Enter the constant term: ");
        c=s.nextInt();
        double d=b*b-4*a*c;
        if(d>0){
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are real and distinct: " +r1+ " and " +r2);
        }
        else if(d==0){
            double r=-b/(2*a);
            System.out.println("Roots are real and equal: " +r);
        }
        else{
            System.out.println("Roots are imaginary");
        }

    }
}

