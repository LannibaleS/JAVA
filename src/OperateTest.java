
public class OperateTest {
	public static void main(String[] args){
		//1������Ч��2*8
		System.out.println(2<<3);
		
		//2����������������ֵ���л�������Ҫ����������
		int a=3 , b=7;
		//ͨ����͵ķ�ʽ���и��׶ˣ��������ݽϴ󣬻ᳬ��int�ķ�Χ
		a = a + b; //a = 3+7 =10
		b = a - b; //b = 3+7-7 = 3
		a = a - b; //a = 3 + 7 - 3 = 7 
		
		
		//ͨ��λ����
		a = a^b; // a = 3^7
		b = a^b; // b = 3^7^7 = 3
		System.out.println("b="+b);
		a = a^b; // a = 3^7^3 = 7
		System.out.println("a="+a);
		
		//��Ԫ���������ʽ�����������ʽ�������ʽ1�����ʽ2
		int x = 2,y;
		y = x>1?100:200;
		System.out.println("y="+y);
		
		//��������������֪����������һ��
		int w = 14, e = 456, r = 678, max;
		max = w > e ? (w > r ? w : r) : (e > r ? e : r);
		//a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("max="+max);
	}
}
