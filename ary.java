public class ary {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40};
        System.out.println(marks.length);

        // System.out.println(marks[0]);
        // System.out.println(marks[20]);

        //for each loop
        System.out.println("FOR EACH");
        for (int i : marks) {
            System.out.println(i);
        }
    }
}
