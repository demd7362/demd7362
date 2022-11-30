package ch18.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws Exception {
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("원본 파일 경로를 입력하세요");
			String filePath = br.readLine();
			System.out.println("복사할 경로를 입력하세요");
			String copyFilePath = br.readLine();
		
			File file = new File(filePath);
			File copyFile = new File(copyFilePath);
			
			if (!file.exists()) {
				System.out.println("원본 파일이 존재하지 않습니다");
				break;
			} else if (!copyFile.getParentFile().exists()) {
				copyFile.getParentFile().mkdirs();
				System.out.println("복사할 파일의 디렉토리를 찾을 수 없습니다. 새로 생성합니다");
			}
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFilePath));
			byte[] bytes = new byte[1024];
			while(true) {
				int num = bis.read(bytes);
				if(num == -1) break;
				bos.write(bytes,0,num);
			}
			bis.close();
			bos.flush();
			bos.close();
			br.close();
			System.out.println("복사가 성공하였습니다.");
			break;
		}
	}

}
