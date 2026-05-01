public class twoNumInOneByte {
    public static void main(String[] args) {
        byte a=9, b=12;
        byte c;
        c=(byte)(a<<4);
        c=(byte)(c|b);
        System.out.println((c&0b11110000)>>4);//to get the first number we will do and operation with 11110000 and then right shift by 4
        System.out.println(c&0b00001111); //to get the second number we will do and operation with 00001111

    }
    
}
