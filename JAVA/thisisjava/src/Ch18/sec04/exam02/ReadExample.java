package Ch18.sec04.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        String txt = "C:/Temp/test.txt";
        // 한 문자씩 읽기
        Reader reader = new FileReader(txt);
        while(true){
            int data = reader.read();
            if(data == -1) break;
            System.out.print((char)data); // 형변환 필수
        }
        reader.close();
        System.out.println();

        //문자 배열로 읽기
        reader = new FileReader(txt);
        char[] data = new char[100];
        while(true){
            int num = reader.read(data);
            if(num == -1) break;
            for(int i=0; i<num; i++){
                System.out.print(data[i]);
            }
        }
        reader.close();
    }
}
