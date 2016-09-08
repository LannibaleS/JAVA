//赋值运算符	
public class OperateDemo2 {
	public static void main(String[] args){
		/*
		 * 赋值运算符
		 * =  +=  -=  *=  /=  %=
		 */
		int a = 3;//右边赋给左边
		a += 4;//将左右两边的和赋值给左边
		
		short s = 4;
		s =  (short) (s + 5);
		s += 5;//会做自动转换过
		
		System.out.println(s);
		
		
		
	}
}
