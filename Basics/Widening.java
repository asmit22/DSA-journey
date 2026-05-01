// Widening is the process of converting a smaller data type to a larger data type.
public class Widening {
    public static void main(String[] args) {
        byte b=10;
        short s=b;
        int i=b; //widening
        long l=b;
        float f=b;
        double d=b;
        //bool bol=b;

        System.out.println(i);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        
    }
}
