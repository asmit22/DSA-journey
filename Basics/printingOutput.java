public class printingOutput {
    public static void main(String[] args) {
        int a=10, b=20;
        String str="hello";
        System.out.println(str);
        System.out.println("sum of a and b is : " +a+b); //concatenation here a+b is treated as string and not addition
        System.out.println("sum of a and b is : " +(a+b));
        System.out.println("Sum of a "+ a + " and b " +b + " is " +(a+b));
        System.out.println(a+b + " is the sum of a and b"); //here a+b is treated as addition and not concatenation
        
}
}