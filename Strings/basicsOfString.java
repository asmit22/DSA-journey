package Strings;

public class basicsOfString {
    public static void main(String[] args) {
    String str="HELLO";  //str is a reference variable which is pointing to the string object "hello" in the string pool
    String str1= new String("hello world");  //str1 is a reference variable which is pointing to the string object "hello" in the heap memory
    char c[] = {'h', 'e', 'l', 'l', 'o'}; 
    String str2= new String(c); 
    String str5= new String(c,0,3); //str5 is a reference variable which is pointing to the string object "hel" in the heap memory
    byte b[]= {65,66,67,68,69}; //ASCII values of A,B,C,D,E
    String str3= new String(b);
    String str4= new String(b,1,2); //str4 is a reference variable which is pointing to the string object "BC" in the heap memory
    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str5);

    //chcking for string pool
    String str6="Java";
    String str7="Java";
    String str8="java";
    System.out.println(str6==str7); //true because str6 and str7 are pointing to the same string object "Java" in the string pool
    System.out.println(str6==str8); //false because str6 and str8 are pointing to different string objects "Java" and "java" in the string pool
    }
}
