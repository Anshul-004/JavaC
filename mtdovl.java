public class mtdovl {

    static void add(int a)
    {
        System.out.println(++a);
    }

    static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        System.out.println("METHOD OVL");
        // add(5); //first function called
        // add(5,6); //second one called -- i.e. method overloading
    }
}
