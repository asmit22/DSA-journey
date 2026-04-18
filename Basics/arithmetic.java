public class arithmetic {
    public static void main(String[] args) {

        int a=30;
        int b= 10;   //(typecasting) remember to use (float) before the value to avoid error
       // float i= 34.5f;               // to declare a float value, we need to add 'f' at the end of the value (otherwise it becomes double by default)
        float c= (float)a+b;
        float d= (float)a-b;
        float e= (float)a*b;
        int g= a%b;
        int f= a/b;
        float h= (a+b)/(2*c);
    
        System.out.println("the sum is: " +c);
        System.out.println("the difference is: " +d);
        System.out.println("the product is: " +e);
        System.out.println("the quotient is: " +f);
        System.out.println("the remainder is: " +g);
        System.out.println("the value is: " +h);
    }    
}
