package Package.meitt.bakos;

import java.io.BufferedReader;
import java.io.FileReader;

public class M95ETT_3_4 {
 
	public static void main(String[] args) {
		
		hf2 (null);
	}
	
	public static void hf2 (String fnev) {
		String sor;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fnev));
			while((sor = br.readLine()) != null) {
				System.out.println(sor.toUpperCase());
			}
			br.close();
			System.out.println("Ok");
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
}
