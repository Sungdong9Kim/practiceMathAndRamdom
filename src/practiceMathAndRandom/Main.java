package practiceMathAndRandom;

import java.util.Random;

public class Main {
	
	public static void main(String args[]) {
		
		//Math.abs : 절대값을 구하는 함수(function for evaluating absolute value)
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(8));
		
		//Math.min(x, y) : x와 y중 더 작은 수를 리턴하는 함수(function for returning the smaller value of x and y)
		//Math.max(x, y) : x와 y중 더 큰 수를 리턴하는 함수(function for returning the greater value of x and y)
		System.out.println(Math.min(4, 10));
		System.out.println(Math.max(4, 10));
		
		//Random class : 사용하기 위해서 java.util.Random 임포트 필요, nextInt를 통해 범위 지정 가능(Need to import java.util.Random to use this, Scoping is possible with nextInt)
		Random rand = new Random();
		System.out.println(rand.nextInt(10)); // 0이상 9 이하의 랜덤한 값
		
		// random값의 범위 설정(set the range of random value)
		int min = 10;
		int max = 30;
		System.out.println(rand.nextInt((max - min) + 1)+ min);
		
	}
}
