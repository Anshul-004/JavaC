import java.util.Scanner;

public class tryct {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        Scanner s = new Scanner(System.in);

        System.out.println("Enter index ");
        int i =s.nextInt();

        System.out.println("Enter to be divided ");
        int x = s.nextInt();

        try
        {
            System.out.println("Index's value is "+ a[i]);
            System.out.println("Div is " + a[i]/x);
        }
        catch(ArithmeticException e){
            System.out.println(("Arithmetic exp aayaa"));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index oob");
        }
        System.out.println("NORMAL FLOW");

        s.close();
    }
}
