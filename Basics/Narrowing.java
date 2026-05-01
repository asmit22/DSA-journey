// Narrowing is the process of converting a larger data type to a smaller data type. This can lead to data loss if the value being converted exceeds the range of the smaller data type. In Java, narrowing can be done explicitly using casting.
public class Narrowing {
    public static void main(String[] args) {
        int i=1000;
        //byte b=i;    //error coz possible lossy conversion                 //narrowing
        short s=(short)i; //narrowing
        long l=(long)i; //widening
        float f=(float)i; //widening
        double d=(double)i; //widening

       
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
