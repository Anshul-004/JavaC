import java.io.*;

public class test {
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);
        System.out.println("HELLO");
        String line = null;

        while ((line = br.readLine()) != null) 
        {
            String tokens[] = line.split("\t");
            System.out.println("Length of tokens is : " + tokens.length);
            for (String s : tokens) {
                System.out.println(s);
            }
            System.out.println("\n\n");

        }

    }
}
