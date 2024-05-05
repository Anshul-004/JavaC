import java.util.Scanner;

public class percentcalc {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int s1, s2, s3, s4, s5;

        System.out.println("*** PERCENTAGE CALCULATOR ***");
        System.out.println("ENTER MARKS :");

        s1 = s.nextInt();
        s2 = s.nextInt();
        s3 = s.nextInt();
        s4 = s.nextInt();
        s5 = s.nextInt();

        if (s1 < 0 || s2 < 0 || s3 < 0 || s4 < 0 || s5 < 0) {
            System.out.println("Marks Must be Greater than 0");
        } else if (s1 > 100 || s2 > 100 || s3 > 100 || s4 > 100 || s5 > 100) {
            System.out.println("Marks Must be Less than 100");
        } else {
            double sum = s1 + s2 + s3 + s4 + s5;
            double res = sum / 5;

            System.out.println(res);
        }

        s.close();
    }
}
