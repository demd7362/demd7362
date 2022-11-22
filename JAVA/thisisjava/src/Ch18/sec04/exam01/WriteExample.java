package Ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/Temp/test.txt");
        
        // 한 문자씩 출력
        char a = 'A';
        writer.write(a);
        char b = 'B';
        writer.write(b);
        // 배열 출력
        char[] arr = {'C','D','E'};
        writer.write(arr);
        // 문자열 출력
        writer.write("FGH");

        writer.flush();

        writer.close();



    }
}
