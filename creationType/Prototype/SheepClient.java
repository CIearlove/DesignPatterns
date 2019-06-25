package Prototype;

import java.util.Date;
/**
 * 测试原型模式（浅克隆）
 * @author Administrator
 *
 */
public class SheepClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(123123123L);
		Sheep s1 = new Sheep("多利",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		Sheep s2 = (Sheep)s1.clone();
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
		date.setTime(321321321L);
		
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}

}
