package Singleton;
/**
 * 语法（定义）:
 * 创建枚举类型要使用 enum关键字，隐含了所创建的类型都是 java.lang.Enum类的子类（java.lang.Enum 是一个抽象类）。
 * 枚举类型的每一个值都将映射到 protected Enum(String name, int ordinal) 构造函数中，
 * 在这里，每个值的名称都被转换成一个字符串，并且序数设置表示了此值被创建的顺序。
 * 
 * @author Administrator
 *
 */
public enum EnumTest {
	MON, TUE, WED, THU, FRI, SAT, SUN;
	private String objName;
	
	
	public static void main(String[] args){
		for(EnumTest e : EnumTest.values()){
			System.out.println(e.toString());
		}
		
		EnumTest test = EnumTest.TUE;
		System.out.println(test.getClass());
        switch (test) {
        case MON:
            System.out.println("今天是星期一");
            break;
        case TUE:
            System.out.println("今天是星期二");
            break;
        // ... ...
        default:
            System.out.println(test);
            break;
        }
        
      //compareTo(E o)
        int cmp = test.compareTo(EnumTest.MON);
        switch (cmp) {
        case -1:
            System.out.println("TUE 在 MON 之前");
            break;
        case 1:
            System.out.println("TUE 在 MON 之后");
            break;
        default:
            System.out.println("TUE 与 MON 在同一位置");
            break;
        }
        
      //getDeclaringClass()
        System.out.println("getDeclaringClass(): " + test.getDeclaringClass().getName());
        
      //name() 和  toString()
        System.out.println("name(): " + test.name());
        System.out.println("toString(): " + test.toString());
        
      //ordinal()
        System.out.println("ordinal(): " + test.ordinal());
	}
}
