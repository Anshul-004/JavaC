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

                //if length is 3 , as everything except label ends in 2 elements for tokens. So add in SYMBOL TABLE
                else if (tokens.length == 3 && tokens[0] != null)
                {
                    symbolTable[symbolTableLine][0] = tokens[0];
                    symbolTable[symbolTableLine][1] = Integer.toString(lc);
                    symbolTable[symbolTableLine][2] = "1";
                    symbolTableLine++;
                }

                else
                {
                    opcodeTable[opcodeTableLine][0] = tokens[0]; //mnemonics

                    
                    opcodeTable[opcodeTableLine][1] = tokens[0];
                    opcodeTable[opcodeTableLine][2] = tokens[0];
                    opcodeTableLine++;
                }


                
            }
            lc++;
            line_count++;
            
        }

        // display

        //literal table
        System.out.println("\nLITERAL TABLE :\n");
        System.out.println("-------------------------");
        System.out.println("Literal \t Address");
        System.out.println("-------------------------");
        for (int i = 0; i < literalTableLine; i++) {
            System.out.println(literalTable[i][0] + "\t\t" + literalTable[i][1] + "\t");
        }
        System.out.println("-------------------------");
        
        //symbol table
        System.out.println("\n\nSYMBOL TABLE :\n");
        System.out.println("---------------------------------");
        System.out.println("Symbol    Address    Length");
        System.out.println("---------------------------------");
        for (int i = 0; i < symbolTableLine; i++) {
            System.out.println(symbolTable[i][0] + "\t" + symbolTable[i][1] + "\t" + symbolTable[i][2]);
        }
        System.out.println("---------------------------------");

    }

}