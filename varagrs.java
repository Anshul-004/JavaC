public class varagrs {
    static int add(int x,int ...arr)
    {
        //... arr --> whatever args are present, are in array arr
        return arr[0];
    }
    public static void main(String[] args) {
        //var args - one function, more than one arguments, without using operator overloading.

        System.out.println(add(10,20,30));
        System.out.println(add(95,20));
        // System.out.println(add(0, null));

        // static int add(int x, int ...arr) --> atleast 1 arg is required.
        // use foreach loop to sum.
    }
}
