package ibm.com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\jj" + File.separator + "Hello.txt");
		Writer outWriter = new FileWriter(file);
		String string = "ËºÆÆÉË¿Ú";
		outWriter.write(string);
		outWriter.close();
		Reader iReader = new FileReader(file);
		char[] c = new char[(char) file.length()];
		int len = iReader.read(c);
		iReader.close();
		System.out.print(new String(c, 0, len));
	}
}
