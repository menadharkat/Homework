package homework1;
import java.io.*;
public class ReaderWrider {




    public class DataReader {
        public static String readFile(String filePath) {
            String text;
            String a = null;
            try {
                FileReader filereader = new FileReader(filePath);
                BufferedReader bufferReader = new BufferedReader(filereader);
                while((text=bufferReader.readLine())!=null )
                {
                    a= text;
                }
            }catch( IOException e) {
                e.printStackTrace();
            }
            System.out.println(a);
            return a;

        }


        public static void writeFile(String filepath , String text) {
            readFile("src/utility/Information.txt");
            try {
                BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(filepath, true));
                bufferWriter.write(","+text);
                bufferWriter.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }


        }

        public static void main(String[] args) {
            writeFile("src/utility/info.txt","so much");
        }
    }




}
