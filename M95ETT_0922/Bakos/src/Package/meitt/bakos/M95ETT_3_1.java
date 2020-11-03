package Package.meitt.bakos;

import java.io.*;

public class M95ETT_3_1 {
	
	public static void main(String[] args) throws IOException {
		
		int db;
		File file = new File("Bakos.txt");
		FileReader in_stream = new FileReader(file);
		
		db = beolvas(in_stream);
		System.out.println("Number of data: " + db);
		
		int [] x = new int[db];
		for(int i = 0; i< db; i++) {
			x[i] = beolvas(in_stream);
			System.out.println(i + ". adat:" + x[i]);
		}
		in_stream.close();
		
		int osszeg = 0;
		for(int i = 0; i < db; i++)
			osszeg += x[i];
		System.out.println("Összeg: " + osszeg);
	}

	public static int beolvas(FileReader bs) throws IOException {
		StringBuffer sz = new StringBuffer(12);
		int b;
		do {
			b = bs.read();
			if((char)b != ',')
				sz.append((char)b);
			else
				break;
		} while (true);
		return Integer.parseInt(sz.toString());
	}
	
}
