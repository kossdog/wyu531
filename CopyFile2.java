package homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
	public static void main(String[] args) throws IOException {
        
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\git\\wyu531\\mylife.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\git\\wyu531\\mylife.txt"));
        int len=0;
        byte[] bytes = new byte[1024];
        while((len =bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();

        
    }
}
