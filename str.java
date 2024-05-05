public class str {
    public static void main(String[] args) {
        // String s = "This is a string";
        // System.out.println(s);

        // String a = new String("Dynamically alloted string");
        // System.out.println(a);

        //strings are immuteable in java, can't be changed for a specific index.
        
        String s = "ANOTHER STRING";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    
        String ntrstr = "  this   ";
        String str = ntrstr.trim();
        System.out.println(ntrstr);
        System.out.println(str);
        System.out.println(str.substring(1,3)); //from begin to end-1
        System.out.println(str.charAt(3));
    }
}
