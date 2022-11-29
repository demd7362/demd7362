package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(1000));
		coinBox.push(new Coin(10000));
		coinBox.push(new Coin(5500));

		while(!coinBox.isEmpty()) { // 스택이 차있으면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
		}
	}

}
