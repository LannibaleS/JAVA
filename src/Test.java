/*
 * �ܽ���ϰ
 * 
 * ����2�������û������·����ݣ���ʾ���·����ĸ�����
 *      3��4��5   ����
 *      6��7��8   �ļ�
 *      9��10��11 �＾
 *      12��1��2  ����
 * ˼·:1��զ��ȡ�����أ�ֻ��ע����
 *     2�������ݽ����ж�
 * ���裺1���������
 *     2������if����ж�
 *   
 */
public class Test {
//	int x=3;
//	if(x == 3 || x==4 || x==5){
//		System.out.println("����");
//	}else if(x == 6 || x==7 || x==8){
//		System.out.println("����");
//	}else if(x == 9 || x==10 || x==11){
//		System.out.println("����");
//	}else(x == 12 || x==1 || x==2){
//		System.out.println("����");
//	}
	
	public static void main(String[] args){
		int x=3 ;
		if(x>12 || x<1){
			System.out.println("null");
		}else if(x>=3 && x<=5){
			System.out.println("chun��");
		}else if(x>=6 && x<=8){
			System.out.println("xia��");
		}else if(x>=9 && x<=11){
			System.out.println("qiu��");
		}else{
		System.out.println("����");
		}
		System.out.println("@@@@@@@@");
			
//##########switch
		switch(x){
		case 3:
		case 4:
		case 5:
			System.out.println("chun��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("xia��");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("qiu��");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("dong��");
			break;
		default:
			System.out.println("null");
				break;
		}

		
/*����3���Ը���������26����ȡ��16���Ƶı�����ʽ
 *  ˼·��1��ɶ��16���ƣ�����һ�ֱ�����ʽ���ô����ڿ��Ա�����ʽ����
 *         ԭ������������4λΪһ��16����λ
 *      2��ԭ����ǶԸ������������ж����Ƶ�ÿ4λ�Ļ�ȡ
 *      3��զ��ȡÿ��λ�أ�
 *        ��ʵ���ǻ�ȡ��λ�е�1������ͨ��&λ����ķ�ʽ
 *      4����Ҫ��ȡ����λ������ͨ����Ԫ���ݽ����޷��ŵ����Ʒ�ʽ
 *  ���裺1�������������¼������
 *      2���Ըñ�������&���㣬��Ȼ�ǻ�ȡ��λ����&�ĸ�1���������ĸ�1����ʮ���Ƶ�15
 *        �κ���&1111��15�������Ȼ��15֮��
 *      3����ԭ���ݽ����޷���������λ
 */
		/*int num = 26;
		//&15,��ȡ�����λ
		int n1 = num & 15;
		System.out.println("n1="+(char)(n1-10+'a'));
		/*          97   98  99   100  101  102
		 * '0'-'9'  'a'  'b' 'c'  'd'  'e'  'f'
		 *  0-9     10   11   12   13   14   15
		 
		//��num������λ
		num = num >>> 4;
		int n2 = num % 15;
		System.out.println("n2="+n2);
		*/
		
		//���϶��������ʣ�������ظ�������&15֮���Ƿ���Ҫ�ַ�ת���޷�ȷ��
		/*
		 * ����ͨ��ѧϰ����������
		 * 1��ͨ��ѭ��������ظ�������
		 * 2��ͨ��if����ǹ���Ҫ��ĸת�����ж�
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
		 * ��ǣ���������
		 * 1������
		 * 2�����㡣������Ҫ�Զ����ݽ��д洢���ڴ�������
		 */
		
		
		//���������е������
		int a = 345, b = 34, c = 6588;
		int tempMax = a>b?a:b;
		int max1 = tempMax>c?tempMax:c;
		System.out.println("max1="+max1);
		
		int max2 = b>c?(a>b?a:b):(a>c?a:c);
		System.out.println("max2="+max2);
		
		
		/* ��������Ļ����ʾ
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
		
		//9x9�˷���
		/* 1*1=1
		 * 1*2=2 2*2=4
		 * 1*3=3 2*3=6 3*3=9
		 */
		for(int r = 1; r<=9 ;r++){
			for(int t = 1; t<=r; t++){
				System.out.print(t+"*"+r+"="+t*r+"\t");
				// \t���Ʊ��
			}
			System.out.println();
		}
		
	}	
	
}
