public class bitwiseOperator {
    public static void main(String[] args) {
        // can also represent numbers in binary 
        // x= 0b1010 (this is 10) y= 0b0110 (this is 6) to write in binary first write 0b then after last binary digits (jabtak 0 na aa jaye)
        int x=0b1010,y=0b0110,z=-10,and,or,xor,lshift,rshift, unsignedRshift,not;
        and= x&y;
        or= x|y;
        xor=x^y;
        lshift= x<<1;
        rshift= x>>1;
        unsignedRshift= z>>>1;
        not= ~y;
        System.out.println("output after AND operation: "+and);
        System.out.println("output after OR operation: "+or);
        System.out.println("output after XOR operation: " +xor);
        System.out.println("output of left shift operator is: " +lshift); //number gets multilpied by 2^k where k is the shift that we do in this case it is 1
        System.out.println("outut of right shift operator is: "+rshift); //number gets divided by 2^k 
        System.out.println(String.format("%s",Integer.toBinaryString(z))) ; // is used in Java to convert an integer z into its binary string representation. 
        System.out.println(String.format("%32s",Integer.toBinaryString(unsignedRshift))) ; //number becomes +ve as the sign bit also moves and the new signed bit becomes 0.
        System.out.println("output of NOT operation: " +not);
    }
    
}
