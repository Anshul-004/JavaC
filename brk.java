public class brk {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i==3) {
                break; //when true, for ke bahar jayega
                // continue; //when true, that purticular iteration will be skipped
            }
            System.out.println(i);
        }
        System.out.println("OUT OF LOOP");
    }
}
