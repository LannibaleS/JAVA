
public class MethodDemo {
	public static void main(String[] args){
		int row = 4;
	    int col = 5;
	    //调用自定义的方法
	    draw(row,col);
	    
	    int sum = add(2,5);
	    System.out.println(sum);
	    
	    printCFB(3);
	}  


//public static(修饰符) void(返回值类型) draw(函数名) (int row, int col){
/* 	执行语句；
 *  return 返回值;  //return关键字是用于结束该功能。并将后面的具体结果返回给调用者
    }
            注意：函数的返回值类型如果是void时，return语句可以省略。return;
        void表示的是没有返回值的情况
 */
public static void draw (int row, int col){
	if(row < 0)
		return;
	
	for(int a=0; a<row; a++){
		for(int b=0; b<col; b++){
			System.out.print("@");
		}
		System.out.println();
		}
	//return;
 	}

/* 如何定义一个函数呢？
 * 函数就是一个功能
 * 功能就需要两部分
 * 1、结果    2、未知内容
 * 明确1：这个功能的结果是什么？
 *      其实就是明确返回值类型
 * 明确2：这个功能需要的未知内容是什么？
 *      其实就是明确参数列表
 */

/*
 * 需求:需要一个方法，进行加法运算，获取两个整数的和
 * 明确1：功能的结果是什么呢？是一个和，和是整数。返回值类型为int
 * 明确2：功能的未知内容有吗？有，加数和被加数。都是int类型，这就是参数列表
 */
public static int add(int x, int y){
	return x+y;
}

//函数的重载；举例：99乘法表
public static void printCFB(){
	printCFB(9);
}

public static void printCFB(int num){
	for(int j = 1; j<=num ; j++){
		for(int k = 1; k<=j ; k++){
			System.out.print(j+"*"+k+"="+j*k+"\t");
		}
		System.out.println();
	}
}

}