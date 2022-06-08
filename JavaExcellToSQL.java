package fileWrite;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static java.lang.Integer.parseInt;



    public class append {
        public static void write(String s, File f) throws IOException{
            FileWriter fw = new FileWriter(f, true);
            fw.write(s);
            fw.close();
        }


        public static void main(String[] args){
            String filepath = "";
            int count=0;

            try{
                File f = new File("");
                String sql="";
                BufferedReader lineReader=new BufferedReader(new FileReader(filepath));
                lineReader.readLine();
                write(sql);
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } ;
        }
    }

