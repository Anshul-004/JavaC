import java.io.*;

public class pass1_asm 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        final int max = 100;
        String line = null;
        // line_count to iterate over the array (line_count) times, lc will store value besides START (e.g. 100)
        int line_count = 0, lc = 0, symbolTableLine = 0, opcodeTableLine = 0, literalTableLine = 0, poolTableLine = 0;

        String opcodeTable[][] = new String[max][3]; //mnemonics, class, info
        String symbolTable[][] = new String[max][3]; //symbol, address, length
        String literalTable[][] = new String[max][2]; // literal, address
        String poolTable[] = new String[max]; //literal


        //---- Loops begin ----

        while ((line = br.readLine()) != null) {
            // System.out.println(line); //shall print the input code in line
            String tokens[] = line.split("\t");
            
            
            //printing input code
            if (line_count == 0) 
            {
                lc = Integer.parseInt(tokens[1]);
                
                for (int i = 0; i < tokens.length; i++) 
                    System.out.print(tokens[i] + "\t");
                
                System.out.println("");
                line_count++;
            }

            else
            {
                for (int i = 0; i < tokens.length; i++) 
                    System.out.print(tokens[i] + "\t");
                
                System.out.println("");

                //Input display complete !

                // Logic to insert data into table using token array.

                if(tokens[0].charAt(0) == '=') //if first character is =, 
                {
                    literalTable[literalTableLine][0] = tokens[0];
                    literalTable[literalTableLine][1] = Integer.toString(lc);
                    literalTableLine++;
                }

                else if ()
                {

                }

                else
                {
                    
                }


                
            }
            lc++;
            line_count++;
            
        }

        // display
        System.out.println("\nLITERAL TABLE :\n");
        System.out.println("----------------------------");
        System.out.println("Literal \t Address");
        System.out.println("----------------------------");
        for (int i = 0; i < literalTableLine; i++) {
            System.out.println(literalTable[i][0] + "\t\t" + literalTable[i][1] + "\t");
        }
        System.out.println("----------------------------");

    }

}