package string_ex2;

import java.util.StringTokenizer;

public class how_to_use_StringTokenizer {
	
	public void test()
	{
		String data = "ȫ�浿, 010-123-1234, ����� ���α�, �л�";
		StringTokenizer st = new StringTokenizer(data, ",");
		
		System.out.println("## private individual info");
		System.out.println("name : " + st.nextToken());
		System.out.println("phonenumber : " + st.nextToken());
		System.out.println("address: " + st.nextToken());
		System.out.println("job : " + st.nextToken());

	}
}