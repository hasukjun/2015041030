package string_ex2;

import java.util.Random;


public class how_to_use_random {
	
	public void test()
	{
		Random r1 = new Random();
		Random r2  = new Random(123);
		Random r3 = new Random(123);
		Random r4 = new Random(System.currentTimeMillis());
		
		System.out.println("## �⺻ ���� ��� ##");
		System.out.println("r1 : " + r1.nextInt(10));
		System.out.println("r2: " + r2.nextInt(10));
		System.out.println("r3: "+ r3.nextInt(10));
		System.out.println("r4: "+ r4.nextInt(10));
		
		System.out.println("## ���� ���� ���� ���##");
		System.out.println("1~20: "+ (r1.nextInt(20)+1));
		
		
		
	}

}
