public class vars {
    public static void main(String[] args) {
        int a = 99;
        int b = 1;
        int c = 2;
        boolean n = false;
        System.out.println(a+b+c);
        if(!n)
        {
            System.out.println("IN LOOP");
        }

        //byte -128 to 128
        byte age = 127; //increase for an error
        System.out.println(age);

        //default type of literals is double, if to be assigned float, f must be added with number
        // float x = 34.5; //error in compatible types , as its a double by default
        float x = 34.5f; //works fine
        System.out.println(x);

        //int,float,byte,double are all classes

        //string
        String str = "NEW STRING";
        System.out.println(str);
    }
}
