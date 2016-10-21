package string_ex2;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class how_to_use_testpackage {

	public void test()
	{
		Date date =new Date();
		DateFormat df1 = DateFormat.getInstance();
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		
		System.out.println("DataFormat �⺻: "+ df1.format(date));
		System.out.println("DateFormat LONG"+ df2.format(date));
		System.out.println("DateFormat TimeZone: " + df1.getTimeZone().getID());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd, hh: mm:a");
		System.out.println("SimpleDateFormat �⺻ :" + sdf1.format(date));
		System.out.println("SimpleDateFormat ���� :"+ sdf2.format(date));
		
		sdf1.applyPattern("yyyy�� MM/dd");
		System.out.println("SimpleDateFormat ��� :" + sdf1.format(date));
	}
}
