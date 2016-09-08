
public class OperateDemo {
	public static void main(String[] args){
		
		/*
		 *  + - * /  %(模 取余数)
		 * 
		 */
		
		int x = 2810;
		System.out.println(x/1000);
		
		System.out.println(2%-6);
		//左边为被模数，右边为模数，最终结果是否为负，只参照（左边）被模数
		//左边<右边  -- 结果等于左边
		//左边=右边  -- 结果等于0
		//左边>右边  -- 自己算
		/*
		 * 模数应用：
		 * 1、任何数模以2，结果不是0就是1 --> 开关的切换
		 * 2、任何数模以一个数，结果一定比这个数小 -->算法中可用
		 * 
		 */
	
		/*
		 * 自增：对原有的数据进行+1
		 */
		int a = 3;
		a++;
		//++运算单独存在时，放左放右是没有区别的的，和其他运算符放在一起时就有区别
		System.out.println("a="+a);
	
		int b = 3,c;
		c = ++b;
		System.out.printf("b="+b,"c="+c);
		System.out.println("b="+b+",c="+c);
	}
}
