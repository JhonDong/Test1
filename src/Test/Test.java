package Test;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date date=new Date();
		long time = date.getTime();
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(currentTimeMillis);
		Date date1=new Date(time);
		System.out.println(date1.toLocaleString());
		
	}
	

}
