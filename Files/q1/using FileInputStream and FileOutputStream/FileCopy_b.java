import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_b {
	public static void main(String[] args) throws IOException
	{
		FileInputStream instream=null;
		FileOutputStream outstream=null;
		
		try {
			File infile=new File("src\\lab25_09_2020\\input1.txt");
			File outfile=new File("src\\lab25_09_2020\\output1b.txt");
			
			instream=new FileInputStream(infile);
			outstream=new FileOutputStream(outfile);
			
			int value;
			
			while((value=instream.read())!=-1)
			{
				outstream.write(value);
			}
			
			instream.close();
			outstream.close();
			
			System.out.print("file copied successfully from input1.txt to output1b.txt\n");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
