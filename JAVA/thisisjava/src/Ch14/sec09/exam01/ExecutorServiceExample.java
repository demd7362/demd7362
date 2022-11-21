package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		es.shutdownNow();

	}

}
