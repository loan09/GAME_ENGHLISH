
package btl_game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    public static String IN_FILE_NAME = "test1.txt";
    
    public FileReader fr = null;
    public BufferedReader br = null;
        
    public int readd() throws FileNotFoundException, IOException
    {
        try{
            fr = new FileReader(IN_FILE_NAME);
            br = new BufferedReader(fr);
            String line;
            int x = 0;
            while((line = br.readLine()) != null){
                x = Integer.parseInt(line);
            }
            return x;
        }finally{
            if(br != null){
                br.close();
            }
            if(fr != null){
                fr.close();
            }
        }
    }
}

