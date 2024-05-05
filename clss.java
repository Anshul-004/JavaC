import java.util.Scanner;

class employee {
    String name, desg;

    Scanner s = new Scanner(System.in);
    employee(String a, String b)
    {   
        name = a;
        desg = b;
    }
}

//ek java file me 1 public class hogi at MOST

public class clss {
    public static void main(String[] args) {
        System.out.println("HI");
        employee e1 = new employee("rohan","manager");
        employee e2= new employee("mohan","clerk");

        System.out.println(e1.name +" "+e1.desg);
        System.out.println(e2.name +" "+e2.desg);

    }
}
