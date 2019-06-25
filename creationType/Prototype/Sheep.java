package Prototype;

import java.util.Date;

public class Sheep implements Cloneable{
	private String sname;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();//直接调用Object对象的clone方法
		
		//添加如下代码实现深复制（DeepClone）
		Sheep s = (Sheep)obj;
		s.birthday = (Date)this.birthday.clone();//把属性也进行克隆
		return s;
	}

	public Sheep() {
		super();
	}

	public Sheep(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}

	public String getSname() {
		return sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
