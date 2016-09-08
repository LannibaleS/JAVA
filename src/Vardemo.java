
public class Vardemo {
	public static void main(String[] args){
		//数据类型 变量名 = 初始化值；
		byte b = 3;		
		short s = 4;		
		int i = 7;		
	    long k = 1111111111233333456l;//对于过大的数，要在结尾加l
	
	    float f = 2.3f; //小数后加f可以表示单精度
	    double d = 3.4;
	    
	    char c = '1';
	    
	    boolean to = true;// or false
	    boolean fo = false;
	    
	    System.out.println("b="+b);
	    
	    //自动类型提升
	    byte q = 3;
	    int w = 4;
	    w = w+q;
	    System.out.println("w="+w);
	    
	    
	    byte e = 3;
	    //右边是常量可以赋值，右边是变量（e+1）则不允许赋值
	    //原因是可能造成精度丢失
	    e =  (byte)(e + 1);//强制转换（不建议使用）
	    System.out.println("e="+e);
	    
	    char ch1 = 97;
	    System.out.println("ch1="+ch1);
	    
	    char ch2 = 'a';
	    System.out.println("ch2="+(ch2+1));
	    
	    char ch3 = 'a';
	    System.out.println("ch3="+(char)(ch3+1));
	}
	
}
