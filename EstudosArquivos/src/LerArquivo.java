import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream(new File("/home/webber/Desktop/test.txt"));
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String linha = null;
			
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
