public class SwapUseBitwise {
    public static void main(String[] args) {
        int a=3, b=5;
        System.out.println("before swapping a= " +a + ", b= " +b);
        a=a^b;
        b=a^b;

        a=a^b;
        System.out.println("After swapping a= " +a + ", b= " +b);
    }
}
  
