
package btl_game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static String FILE_OUT = "test1.txt";
    
    public FileWriter fw = null;
    public BufferedWriter bw = null;
    
    public void write(String x) throws IOException{
        try {
            fw = new FileWriter(FILE_OUT);
            bw = new BufferedWriter(fw);
            bw.write(x);            
        }finally{
            if(bw != null){
                bw.close();
            }
            if(fw != null){
                fw.close();
            }
        }
    }
}

