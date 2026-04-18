import java.util.*;
public class volOfCuboid {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int Length, Breadth, Height, vol, area;
        System.out.println("Enter length of cuboid: " );
        Length = s.nextInt();
        System.out.println("Enter breadth of cuboid: ");
        Breadth = s.nextInt();
        System.out.println("Enter height of cuboid: ");
        Height = s.nextInt();
        vol = Length*Breadth*Height;
        area = 2*(Length*Breadth + Breadth*Height +Height*Length);
        System.out.println("vol of cuboid is: " +vol);
        System.out.println("area of cuboid is: " +area);

    }
    
}
