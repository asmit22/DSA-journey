public class question_typecast {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        double result = a / b;
        System.out.println(result);


        int a1 = 7;
        int b1 = 2;
        double result1 = (double) a1 / b1;  //(double) is used to typecast the value of a1 to double before performing the division operation, which ensures that the result is a double value instead of an integer.
        System.out.println(result1);

        long a2 = 100000;  // changed int -> long to fix the error of integer overflow (when the result exceeds the maximum value that can be stored in an int variable, it wraps around and gives an incorrect result) 
        long b2 = 100000;
        long result2 = a2 * b2;
        System.out.println(result2);

        char ch = 'C';
        char x = (char)(ch + 2);
        System.out.println(x);
        
        double x3 = 9.8;
        int y = (int) (x3 + 2);
        System.out.println(y);

        int a3 = 5;
        double b3 = 2;
        System.out.println(a3 + b3);
        System.out.println(a3 / b3);

        int a4 = 5;
        int b4 = 2;
        double result3 = (double)(a4 / b4);
        double result4 = (double)a4 / b4;
        System.out.println(result3);
        System.out.println(result4);

        
}
}