package string_ex2;

import java.util.Scanner; 

public class How_to_use_System_Class {
	
	public void test()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ȯ�溯�� PATH : "+ System.getenv("PATH"));
		
		
		System.setProperty("user", "hong gils dong");
		System.out.println("user �Ӽ���: "+ System.getProperty("user"));
		
		
		System.out.println("�����Ϸ��� x�� ��������"	);
		
		while(true)
		{
			if(scanner.next().equals("x"))
			{
				System.out.println("���α׷� ������!!");
				System.exit(0);	
			}
			else
				System.out.println("�ٽ� �Է��ϼ���!!");
		}
	}

}
