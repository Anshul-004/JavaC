public class fin {
    public static void main(String[] args) {
        fin a = new fin();

        System.out.println(a.hashCode());
        a=null;
        //garbage collector
        System.gc();
    }
        @Override
        protected void finalize()
        {
            System.out.println("FInalizeddd");
        }
}
