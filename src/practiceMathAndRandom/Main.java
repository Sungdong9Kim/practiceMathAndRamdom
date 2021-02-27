package practiceMathAndRandom;

import java.util.Random;

public class Main {
	
	public static void main(String args[]) {
		
		//Math.abs : ���밪�� ���ϴ� �Լ�(function for evaluating absolute value)
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(8));
		
		//Math.min(x, y) : x�� y�� �� ���� ���� �����ϴ� �Լ�(function for returning the smaller value of x and y)
		//Math.max(x, y) : x�� y�� �� ū ���� �����ϴ� �Լ�(function for returning the greater value of x and y)
		System.out.println(Math.min(4, 10));
		System.out.println(Math.max(4, 10));
		
		//Random class : ����ϱ� ���ؼ� java.util.Random ����Ʈ �ʿ�, nextInt�� ���� ���� ���� ����(Need to import java.util.Random to use this, Scoping is possible with nextInt)
		Random rand = new Random();
		System.out.println(rand.nextInt(10)); // 0�̻� 9 ������ ������ ��
		
		// random���� ���� ����(set the range of random value)
		int min = 10;
		int max = 30;
		System.out.println(rand.nextInt((max - min) + 1)+ min);
		
	}
}
