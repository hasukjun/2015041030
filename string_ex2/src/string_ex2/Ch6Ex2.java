package string_ex2;

public class Ch6Ex2 {

	public static void main(String[] args) {
		String str1= "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
			
		String str4 = String.valueOf(30);
		
		String num1  = "20";
		
		if(str1 == str2)
			System.out.println("str1 �� str2�� �����ϴ�.");
		else
			System.out.println("str1 �� str2��  �ٸ��ϴ�.");
		
		if(str1.equals(str3))
			System.out.println("str1 �� str3�� �����ϴ�.");
		else 
			System.out.println("str1�� str3�� ���� �ʽ��ϴ�.");
		
		System.out.println("num1 + 30 = "  + num1 + 30);
		System.out.println("str1�� ���� :"+ str1.length());
		System.out.println("str1�� 4��° ���� : "+str1.charAt(3));
		System.out.println("str1 �� 2~4 ��ġ�� �ִ� ���ڿ� : " + str1.substring(1,4));
		System.out.println("str1�� 1�� k�� ġȯ : "+ str1.replace('1', 'k'));
////////////////////////////////////////////////////
		practice2_StringBuffer testcase = new practice2_StringBuffer();
		 
		testcase.test1();
///////////////////////////////////////////////////
		
		
		
	}

}
