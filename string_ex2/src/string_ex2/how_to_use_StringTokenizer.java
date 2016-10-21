package string_ex2;

import java.util.StringTokenizer;

public class how_to_use_StringTokenizer {
	
	public void test()
	{
		String data = "홍길동, 010-123-1234, 서울시 종로구, 학생";
		StringTokenizer st = new StringTokenizer(data, ",");
		
		System.out.println("## private individual info");
		System.out.println("name : " + st.nextToken());
		System.out.println("phonenumber : " + st.nextToken());
		System.out.println("address: " + st.nextToken());
		System.out.println("job : " + st.nextToken());

	}
}