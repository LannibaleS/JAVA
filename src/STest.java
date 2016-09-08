/*
 *  switch和if的区别？
	1、if可以用于判断数值，也可以判断区间
                   只要运算结果是Boolean类型，都可以进行判断
	2、Switch用于对固定的几个值，进行判断。判断的值得类型有限

 */
public class STest {
	public static void main(String[] args){
		int y = 9;
		
		switch(y){
		case 1:
			System.out.println(y+"对应的是星期一");
			break;
		case 2:
			System.out.println(y+"对应的是星期二");
			break;
		case 3:
			System.out.println(y+"对应的是星期三");
			break;
		case 4:
			System.out.println(y+"对应的是星期四");
			break;
		case 5:
			System.out.println(y+"对应的是星期五");
			break;
		case 6:
			System.out.println(y+"对应的是星期六");
			break;
		case 7:
			System.out.println(y+"对应的是星期日");
			break;
		default:
			System.out.println(y+"对应的是null");
			break;
		}
	}
}
