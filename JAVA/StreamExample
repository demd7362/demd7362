import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StreamExample {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		// 한 문장씩 읽는다 
//		int data = is.read(); 
//		is.close();
//		
//		os.write(data); 
//		os.flush(); 
//		os.close();

		
		// 배열의 크기만큼씩 읽는다 
//		char[] dataArr = new char[2];
//		isr.read(dataArr);
//		isr.close();
		
//		osw.write(dataArr);
//		osw.flush();
//		osw.close();
		
		String s = br.readLine(); // 버퍼만 가능한 메소드
		br.close();
		
		bw.write(s);
		bw.newLine(); // 개행 메소드
		bw.flush();
		bw.close();
		
	}

}
