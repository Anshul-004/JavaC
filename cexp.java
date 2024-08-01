import java.util.Scanner;

class Myexp extends Exception{
    @Override
    public String toString(){
        return "Personal error";
    }
}

public class cexp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(a>5)
        {
            try
            {
                s.close();
                throw new Myexp();
            }
            catch(Exception e)
            {
                // throw new ArithmeticException("More than 5");
                System.out.println(e.toString());
            }
        }
        System.out.println("NOrmnal ");

        s.close();
    }
}
