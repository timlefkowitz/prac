import java.io.File;

public class readFile {

    public static void main (String args[]){

        try{
            File sourceFolder = new File("C:/temp/"); // give your folder a path here
            String fileExt = " ";
            for(File sourceFile : sourceFolder.listFiles()){

                String fileName = sourceFile.getName();

                fileExt = fileName.subString(fileName.lastIndexOf(".")+1);

                if(fileExt.equalsIgnoreCase("txt")) {
                    System.out.println("we have read "+fileName+" successfully");
                } else {
                    System.out.println("filename extensions not supported");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}