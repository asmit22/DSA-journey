public class formattedOutput {
    public static void main(String[] args) {
        int x=10, a=-10;
        float y=35.5453f;
        char ch='A';
        String str="hii";
        System.out.printf("Hello %d %o %x %f %e %c %s\n",x,x,x,y,y,ch,str);
        System.out.printf("%1$d %2$f %1$d\n",x,y); //here 1$ means that we want to print the first argument multiple times
        //we can also specify the width of the output using printf
        System.out.printf("%10d\n",x); //10 means that we want to print the output in a width of 10 characters
        System.out.printf("%-10d\n",x); //-10 means that we want to print the output in a width of 10 characters and left align it
        System.out.printf("%010d\n",x); //010 means that we want to print the output in a width of 10 characters and pad it with zeros
        System.out.printf("%(5d\n",x);  //(5 means that we want to print the output in a width of 5 characters and if the number is negative then we want to print it in parentheses
        System.out.printf("%(d\n",a); //(5 means that we want to print the output in a width of 5 characters and if the number is negative then we want to print it in parentheses
        System.out.printf("%06.2f\n",y); //6 means that we want to print the output in a width of 6 characters and .2 means that we want to print only 2 digits after the decimal point
    }
}
