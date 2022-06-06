import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Integer.parseInt;

public class CSVconsume {
    public static void main(String[] args){
        String jdbcURL ="jdbc:mysql://localhost:3306/ems";
        String username="root";
        String password="password";

        String filepath = "C:\\Users\\timothy.lefkowitz\\Desktop\\DataBaseINSERTS";
        int batchSize=20;

        Connection connection =null;

        try {
            connection = DriverManager.getConnection(jdbcURL,username,password);
            connection.setAutoCommit(false);

            String sql="insert into tableHere(id,name,salary) values(?,?,?,?)";

            PreparedStatement statement=connection.prepareStatement(sql);

            BufferedReader lineReader=new BufferedReader(new FileReader(filepath));

            String lineText=null;
            int count=0;

            lineReader.readLine();
            while((lineText=lineReader.readLine())!=null){
                String[] data=lineText.split(",");

//                String id=data[];
//                String name=data[1];
//                String address=data[2];
                String LABEL=data[0];
                String PRICE_TYPE=data[1];
                String MAIL_CLASS=data[2];
                String SKU_ID=data[3];
                int ZONE=data[4];
                double MIN_WEIGHT=data[5];
                double MAX_WEIGHT=data[6];
                String START_DATE=data[7];






                statement.setInt(1,parseInt(id));
                statement.setString(2,name);
                statement.setString(3,address);
                statement.addBatch();
                if(count%batchSize==0){
                    statement.executeBatch();
                }
            }
            lineReader.close();
            statement.executeBatch();
            connection.commit();
            connection.close();
            System.out.println("Data has been inserted successfully");
        }
        catch (Exception exception){
            exception.printStackTrace();
        }


    }
}
