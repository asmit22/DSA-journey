import java.util.*;
public class areaOfTriangle {
     public static void main(String[] args) {
        // Scanner s= new Scanner(System.in);
        // double b,h;
        // double area;
        // System.out.println("Enter base length of triangle: ");
        // b=s.nextDouble();
        //  System.out.println("Enter height of trainagle:");
        // h=s.nextDouble();
        // area=(1.0/2)*b*h;     // here if we write 1/2 then it shows error because in this both are integer so there division makes it 0.5 which is not a int and nearest int is 0 then everything is zero 
        // System.out.println("Area of triangle is:" +area);   // so we can either declare it as (1f/2f) or (1.0/2.0)

        // using herons formula
        Scanner sc= new Scanner(System.in);
        double a,b,c,s;
        System.out.println("Enter length of side a: ");
        a=sc.nextDouble();
        System.out.println("Enter length of side b: ");
        b=sc.nextDouble();
        System.out.println("Enter length of side c: ");
        c=sc.nextDouble();
        s=(a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of given triangle is : " +area);

     }
}
