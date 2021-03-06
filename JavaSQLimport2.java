package fileWrite;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

/**
 *  welcome to our append application
 *  this application will take a CSV and append to our database scripts
 *
 */


public class SQL_import_script {

    /**
     *  This application is to take a CSV file and import into our pricing insert statements
     *
     *
     * @param s
     * @param f
     * @throws IOException
     */
    public static void main(String[] args){
        int count=0;
        try{
            // our file we want to write too
            File f = new File("C:\\Projects\\ML.sql");
//            File f = new File("C:\\Projects\\MML.sql");
            // telling our instance we want to append with the true parameter
            FileWriter fw = new FileWriter(f, true);
//          Our filePath
//          String filepath = "C:\\Users\\timothy.lefkowitz\\sheet.csv";
            String filepath = "C:\\Users\\timothy.lefkowitz\\\\ps2.csv";

            try {
                BufferedReader lineReader=new BufferedReader(new FileReader(filepath));
                String line;
                while((line = lineReader.readLine()) != null){
                    String[] items = line.split(",");
                    
                    // this stream if done correctly would be a better way then calling each variable 
                    String itemsQ = Stream.of(items).collect(Collectors.joining(("','"), "'" , "'"));
                        String LABEL = items[0] + "'" ;
                        String PRICE_TYPE = "'" + items[1] + "'" ;
                        String MAIL_CLASS = "'" + items[2] + "'" ;
                     
                        fw.write ("\n" + "Insert into UPE_CARBON_PS_EMISSIONS(LABEL,PRICE_TYPE) values "+"('"+LABEL +", "+ PRICE_TYPE +", "+  +",  +", "+ + ");");

                }

                fw.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        catch(IOException e){
            e.printStackTrace();

        }

    }
}
