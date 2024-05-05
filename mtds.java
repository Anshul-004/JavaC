public class mtds {
    
    static void add(int x, int y) //static lgega to call it in main
    {
        x++;
    }
    
    public static void main(String[] args) {
        // mtds m = new mtds(); //object to call non-static members of class mtds
        // mtds m1 = new mtds();
        System.out.println("K");

        // int a = m.add(5, 9);
        add(5, 9);
        // int b = m1.add(5, 9);
        // System.out.println(a);
        // System.out.println(b);
    }
}
