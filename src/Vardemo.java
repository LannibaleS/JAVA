
public class Vardemo {
	public static void main(String[] args){
		//�������� ������ = ��ʼ��ֵ��
		byte b = 3;		
		short s = 4;		
		int i = 7;		
	    long k = 1111111111233333456l;//���ڹ��������Ҫ�ڽ�β��l
	
	    float f = 2.3f; //С�����f���Ա�ʾ������
	    double d = 3.4;
	    
	    char c = '1';
	    
	    boolean to = true;// or false
	    boolean fo = false;
	    
	    System.out.println("b="+b);
	    
	    //�Զ���������
	    byte q = 3;
	    int w = 4;
	    w = w+q;
	    System.out.println("w="+w);
	    
	    
	    byte e = 3;
	    //�ұ��ǳ������Ը�ֵ���ұ��Ǳ�����e+1��������ֵ
	    //ԭ���ǿ�����ɾ��ȶ�ʧ
	    e =  (byte)(e + 1);//ǿ��ת����������ʹ�ã�
	    System.out.println("e="+e);
	    
	    char ch1 = 97;
	    System.out.println("ch1="+ch1);
	    
	    char ch2 = 'a';
	    System.out.println("ch2="+(ch2+1));
	    
	    char ch3 = 'a';
	    System.out.println("ch3="+(char)(ch3+1));
	}
	
}
