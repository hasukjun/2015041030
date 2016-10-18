package string_ex2;

public class practice2_StringBuffer {

	public void test1()
	{
		String str = "문자열";
		for( int i=0 ; i<50 ;i++)
		{
			str = str +1;
		}
		
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();
		sb.append("문자령");
		
		for(int i=0; i<50; i++)
			sb.append(i);
		
		System.out.println(sb.toString());
		
		
	}
}
