import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CountReader {

	String filename;
	
	public CountReader(String filename) throws IOException{
		this.filename = filename;
//		readCount(filename);
	}
	
	
	public String readCount() throws IOException {
		String line;
		StringBuilder seq = new StringBuilder();

		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		
		
		
//		FileInputStream inputStream = null;
//		Scanner sc = null;
		
//		try {
//			inputStream = new FileInputStream(filename);
//			sc = new Scanner(inputStream, "UTF-8");
			

			
	//		List<Integer> sequence = new ArrayList<Integer>();
	//		List<StartPosition> sps = new ArrayList<StartPosition>();
			
			//Adds sequences from multiple sequence alignment to individual strings.
			while ((line = br.readLine()) != null) {	
//				String[] values = line.split("\t");
	//			int chrom = Integer.valueOf(values[0]);
	//			int pos = Integer.valueOf(values[1]);
//				int read_count = Integer.valueOf(values[2]);
				
				seq.append(line.split("\t")[2].trim());
				
	//			StartPosition sp = new StartPosition(chrom, pos, read_count);
	//			sps.add(sp);
			}
			
//			if (sc.ioException() != null) {
//				throw sc.ioException();
//			}
			
	//		StartPositions st_pos = new StartPositions(sps, seq.toString());
			
//		} finally {
//			if (inputStream != null) {
//				inputStream.close();
//			}
//			if (sc != null) {
//				sc.close();
//			}
//		}

		
		return seq.toString();
	}
	
}
