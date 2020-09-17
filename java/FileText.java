package ibm.com.file;

import java.io.File;

public class FileText {
	public static void main(String[] args) {
		String path = "C://";
		File file = new File(path);
		func(file);
	}

	private static void func(File file) {
		File[] fs = file.listFiles();
		for (File f : fs) {
			if (f.isDirectory())
				func(f);
			if (f.isFile())
				System.out.println(f);
		}
	}
}