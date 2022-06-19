package fileWrite;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 *
 */


public class append {

}


    public static void main(String[] args){
        int count=0;
        try{

            File f = new File("C:\\Projects\\c.sql");

            FileWriter fw = new FileWriter(f, true);
            String sql= "(Insert into CARBS(HAM,BURGER,TEA) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            String filepath = "C:\\v.csv";
            String filepath = "C:\\Users\\timothy.lefkowitz\\Desktop\\Book1.csv";

            try {
                BufferedReader lineReader=new BufferedReader(new FileReader(filepath));
                String line;
                while((line = lineReader.readLine()) != null){
                    String[] items = line.split(",");
                    System.out.println(Arrays.toString(items));
                    // we need to add strings within some of these elements
                    // @items[3] + "by_date" + items[4] (continue items string) @items6 + "null" 
                    fw.write(  "\n"+"Insert into CARBS (HAM,BURGER,TEA) values (''" + Arrays.toString(items));

                }
//                String inputLine = lineReader.readLine();
               fw.write(inputLine);
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
