import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr=new FileReader("src\\lab25_09_2020\\input1.txt");			
			BufferedReader br=new BufferedReader(fr);

			FileWriter fw=new FileWriter("src\\lab25_09_2020\\output1a.txt",true);
			
			String s;
			
			while((s=br.readLine())!=null) {
				fw.write(s);
				fw.write("\n");
				fw.flush();
			}
			
			br.close();
			fw.close();
			
			System.out.print("file copied from input1.txt to output1a.txt\n");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
