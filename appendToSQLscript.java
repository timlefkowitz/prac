package fileWrite;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

/**
 *
 */


public class append {

    public static void main(String[] args){
        int count=0;
        try{

            File f = new File("C:\\Projects\\c.sql");
            FileWriter fw = new FileWriter(f);
            String sql= "(Insert into CARBS(HAM,BURGER,TEA) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            String filepath = "C:\\v.csv";
            String filepath = "C:\\Projects\\Sheet.csv";

            try {
                BufferedReader lineReader=new BufferedReader(new FileReader(filepath));
                String line;
                while((line = lineReader.readLine()) != null){
                    String[] items = line.split(",");
                    String itemsQ = Stream.of(items).collect(Collectors.joining("\",\"", "\"" , "\""));
                    System.out.println(itemsQ);

                    fw.write(  "\n"+"Insert into CARBS (HAM,BURGER,TEA) values (" + itemsQ);

                }
//                String inputLine = lineReader.readLine();
//               fw.write(inputLine);
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
