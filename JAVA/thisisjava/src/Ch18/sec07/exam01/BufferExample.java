package Ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

    public static long copy(InputStream is,OutputStream os) throws Exception {
        // 시작 시간 저장
        long start = System.nanoTime();
        while(true){
            int data = is.read();
            if(data == -1 ) break;
            os.write(data);
        }
        os.flush();
        // 끝 시간 저장
        long end = System.nanoTime();
        return end-start;
    }
    public static void main(String[] args) throws Exception {
        //입출력 스트림 생성
        String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";

        InputStream fis = new FileInputStream(originalFilePath1);
        OutputStream fos = new FileOutputStream(targetFilePath1);

        //입출력 스트림 + 버퍼 스트림 생성

        String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        
        InputStream fis2 = new FileInputStream(originalFilePath2);
        OutputStream fos2 = new FileOutputStream(targetFilePath2);

        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        // 버퍼를 사용하지 않고 복사
        long nonBufferTime = copy(fis,fos);
        System.out.println("버퍼 미사용:\t "+nonBufferTime+" ns");

        long bufferTime = copy(bis,bos);
        System.out.println("버퍼 사용:\t "+bufferTime+" ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
}
