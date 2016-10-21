package string_ex2;

import java.util.Scanner; 

public class How_to_use_System_Class {
	
	public void test()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("환경변수 PATH : "+ System.getenv("PATH"));
		
		
		System.setProperty("user", "hong gils dong");
		System.out.println("user 속성값: "+ System.getProperty("user"));
		
		
		System.out.println("종료하려변 x를 누르세요"	);
		
		while(true)
		{
			if(scanner.next().equals("x"))
			{
				System.out.println("프로그램 종료합!!");
				System.exit(0);	
			}
			else
				System.out.println("다시 입력하세요!!");
		}
	}

}
