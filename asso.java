public class asso {
    public static void main(String[] args) {
        //bodmas doesn't work here, precedence and associativity does
        //precedence is the order of eval, and associativity kicks in when precedence is same .
        /*
            Associativity: Left TO Right
            Precedence :
            *,/,%
            + , - 
        */
        
        // int + int = int
        // long + float = float, int + float = float

        // float a = 6.7f;
        // long b = 56l;
        // System.out.println(a+b); //float

        // long + double , float + double = double

        // increment / decrement operators
        // int a = 55;
        // System.out.println(a++); //pehele print, then increment
        // int b = 34;
        // System.out.println(++b); //pehele increment, then print

        
        // float a = 7/4*9/2; //ints, so it'll be in int and wrong
        double a = 7.0/4.0*9.0/2.0; // this will give correct result, as its in double
        System.out.println(a); 
    }
}
