package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<>();
		
		queue.offer(new Message("sendMail","홍길동"));
		queue.offer(new Message("sendSMS","정지훈"));
		queue.offer(new Message("sendKakaoTalk","감자"));
		
		while(!queue.isEmpty()) {
			
			Message message = queue.poll();
			switch(message.command) {
			case "sendMail" : System.out.println(message.to + "님께 메일을 보냅니다"); break;
			case "sendSMS" : System.out.println(message.to + "님께 문자를 보냅니다"); break;
			case "sendKakaoTalk" : System.out.println(message.to + "님께 카톡을 보냅니다"); break;
			
			}
		}

	}

}
