import java.io.*;
import java.util.Scanner;
public class ReadWrite{
  public static void main( String[] args ) {

    try {

        Scanner in = new Scanner(new File(args[1]));    //args 1 is the file being read
        FileWriter writer = new FileWriter(args[2]);   // args 2 is the file being written to (both can be set to same file)
        PrintWriter outfile = new PrintWriter(writer);

        while ( in.hasNextLine()) {            //checks if end of file
          String Line = in.nextLine();         // doing in.nextLine moves pointer to nect line

          if ( Line.toLowerCase().indexOf(args[0].toLowerCase()) != -1 ) {        // if args[0] string is on the current line in text file....
            System.out.println(Line);

            outfile.println(Line);  //outputs to teext fill
          }
        }
            in.close();
            outfile.close();
    }
    catch ( Exception e ) {
        System.out.println( e );
    }
}

}
