
public class FlowControl {
	public static void main(String[] args){
		//格式一：if
		int x = 1;
		if(x > 1){
			System.out.println("yes");
		}
		System.out.println("good");
		
		//格式二：if - else
		int a = 3;
		if(a > 1){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		int b = 1, c;
		if(b > 1){
			c = 100;
		}else{
			c = 200;
		}
		//if - else和三元运算符很像，可以理解为三元运算符是if-else的简写形式
		/* 区别：
		 * 弊端：并不是所有if-else都能用三元运算符简写
		 * 原因：因为三元运算符运算完必须有结果，if-else不是必须有结果
		 */
		
		//格式三：if - else if - else
		/* if(条件表达式)
		 * {
		 *    执行语句;
		 * }
		 * else if
		 * {
		 *    执行语句;
		 * }
		 * ......
		 * else
		 * {
		 *    执行语句;
		 * }
		 */
		int z = 3;
		if(z > 1){
			System.out.println("L");
		}
		else if(z > 2){
			System.out.println("yes");
		}
		else if (z > 3){
			System.out.println("k");
		}else{
			System.out.println("z");
		}		
	}
}

class IfTest{
	public static void main(String[] args){
		/*
		 * 需求：根据用户的给定的数值，显示该数值对应的日期。如：2，星期二
		 * 思路：
		 *    1、咋获取这个数值呢？来源有很多，不确定，只要不确定的数据，就用变量存储，只要操作这个变量就行
		 *    2、数值不确定，如何显示对应的星期呢？那就需要对该数值进行判断
		 *    3、咋显示呢？通过输出语句就可以显示在屏幕上
		 *    
		 * 步骤：
		 *    1、定义变量，记录数据
		 *    2、通过判断结构语句if对该变量进行判断
		 *    3、根据不同的条件，通过输出语句显示不同的结果
		 */
		
		//1、定义变量，记录数据
		int week = 3;
		
		//2、通过判断结构语句if对该变量进行判断
		
		
		//3、根据不同的条件，通过输出语句显示不同的结果
	}
}

class SwitchDemo{
	public static void main(String[] args){
		/*
		  switch(表达式)
		  {
		  	  case 取值1：
		  	                执行语句；
		  	      break；
		      case 取值2：
		  	             执行语句；
		  	    break；
		  	   ...
		  	   default:
		  	           执行语句；
		  	    break；
		  }
		 */
		/*
		 *  switch语句特点：
			1、答案的书写没有顺序
			2、匹配的答案被执行，一直执行到break结束或者执行到switch语句结束
		 */
		int x = 3;
		switch(x){ //byte,short,int,enum,String
		case 5:
			System.out.println("a");
			break;
		case 3:
			System.out.println("b");
			break;
		default:
			System.out.println("yes");
			break;			
		}
	}
}
