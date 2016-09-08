/*
 * 总结练习
 * 
 * 需求2：根据用户给的月份数据，显示该月份在哪个季节
 *      3、4、5   春季
 *      6、7、8   夏季
 *      9、10、11 秋季
 *      12、1、2  冬季
 * 思路:1、咋获取数据呢，只关注变量
 *     2、对数据进行判断
 * 步骤：1、定义变量
 *     2、定义if语句判断
 *   
 */
public class Test {
//	int x=3;
//	if(x == 3 || x==4 || x==5){
//		System.out.println("春天");
//	}else if(x == 6 || x==7 || x==8){
//		System.out.println("夏天");
//	}else if(x == 9 || x==10 || x==11){
//		System.out.println("秋天");
//	}else(x == 12 || x==1 || x==2){
//		System.out.println("冬天");
//	}
	
	public static void main(String[] args){
		int x=3 ;
		if(x>12 || x<1){
			System.out.println("null");
		}else if(x>=3 && x<=5){
			System.out.println("chun天");
		}else if(x>=6 && x<=8){
			System.out.println("xia天");
		}else if(x>=9 && x<=11){
			System.out.println("qiu天");
		}else{
		System.out.println("冬天");
		}
		System.out.println("@@@@@@@@");
			
//##########switch
		switch(x){
		case 3:
		case 4:
		case 5:
			System.out.println("chun天");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("xia天");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("qiu天");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("dong天");
			break;
		default:
			System.out.println("null");
				break;
		}

		
/*需求3：对给定的整数26，获取其16进制的表现形式
 *  思路：1、啥是16进制，数据一种表现形式，好处在于可以表现形式更短
 *         原理：将二进制中4位为一个16进制位
 *      2、原理就是对给定的整数进行二进制的每4位的获取
 *      3、咋获取每四位呢？
 *        其实就是获取四位中的1，可以通过&位运算的方式
 *      4、想要获取下四位，可以通过对元数据进行无符号的右移方式
 *  步骤：1、定义变量，记录该整数
 *      2、对该变量进行&运算，既然是获取四位，就&四个1，二进制四个1就是十进制的15
 *        任何数&1111（15）结果必然在15之内
 *      3、对原数据进行无符号右移四位
 */
		/*int num = 26;
		//&15,获取最低四位
		int n1 = num & 15;
		System.out.println("n1="+(char)(n1-10+'a'));
		/*          97   98  99   100  101  102
		 * '0'-'9'  'a'  'b' 'c'  'd'  'e'  'f'
		 *  0-9     10   11   12   13   14   15
		 
		//对num右移四位
		num = num >>> 4;
		int n2 = num % 15;
		System.out.println("n2="+n2);
		*/
		
		//以上动作不合适，运算很重复，到底&15之后是否需要字符转换无法确定
		/*
		 * 所以通过学习的语句来完成
		 * 1、通过循环，完成重复的运算
		 * 2、通过if完成是够需要字母转换的判断
		 */
		int num = 1251241 ;
		for(int i = 0; i < 8; i++){
			int n = num & 15;
			if(n>=10){
				System.out.println((char)(n-10+'A'));
			}
			else
				System.out.println(n);
			num = num >>> 4;
		}
		System.out.println("$$$$$$$$$$");
		/*
		 * 后记：两个问题
		 * 1、反了
		 * 2、多零。烦！需要对多数据进行存储。期待：数组
		 */
		
		
		//求三个数中的最大数
		int a = 345, b = 34, c = 6588;
		int tempMax = a>b?a:b;
		int max1 = tempMax>c?tempMax:c;
		System.out.println("max1="+max1);
		
		int max2 = b>c?(a>b?a:b):(a>c?a:c);
		System.out.println("max2="+max2);
		
		
		/* 需求：在屏幕上显示
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 */
		for(int q = 1;q <=5 ; q++ ){
			for(int w = 5; w>=q ; w--){
				System.out.print(w) ;
			}
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@");
		
		//9x9乘法表
		/* 1*1=1
		 * 1*2=2 2*2=4
		 * 1*3=3 2*3=6 3*3=9
		 */
		for(int r = 1; r<=9 ;r++){
			for(int t = 1; t<=r; t++){
				System.out.print(t+"*"+r+"="+t*r+"\t");
				// \t：制表符
			}
			System.out.println();
		}
		
	}	
	
}
