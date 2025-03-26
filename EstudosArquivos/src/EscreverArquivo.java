import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreverArquivo {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream(new File("/home/webber/Desktop/test.txt"));
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter writer = new BufferedWriter(osw);
			writer.write("Carlos");
			writer.write("\n");
			writer.write("Miguel");
			writer.write("\n");
			writer.write("Taísa");
			writer.write("\n");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
