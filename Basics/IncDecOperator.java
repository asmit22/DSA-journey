public class IncDecOperator {
    public static void main(String[] args) {
        int x=5; int y;
        y= x++;
        System.out.println("x: "+x); //6
        System.out.println("y: "+y); //5

        char c='A';
        c++;           // therefore it works on char as well
        System.out.println("c: "+c); //B

        byte a=10, b=13;
        a++;
        System.out.println("a: "+a); //11
        // but if we do b= b+1; it will give error because b+1 is int and cannot be assigned to byte without type casting
        b=(byte)(b+1); // b= b+1 X does not work
        System.out.println("b: "+b); //14

        float f= 1.5f;
        f++; // works on float as well
        System.out.println("f: "+f); //2.5
    }
}
