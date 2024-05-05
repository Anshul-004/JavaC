import java.util.Scanner;

public class userinp {
    public static void main(String[] args) {
        System.out.println("TAKING USER INPUT IN JAVA");
        Scanner s = new Scanner(System.in);

        //taking no as input and displaying it

        int n = s.nextInt();
        System.out.println(n);

        // float x = s.nextFloat();
        // System.out.println(x);
    
        
        // boolean t = s.hasNextInt(); //checks in inp is int
        // System.out.println(t);

        // String str = s.next(); //sirf first word dega
        // String str = s.nextLine();
        // System.out.println(str);
        
        
        
        s.close();
    }
}
