
public class WhileDemo {
	public static void main(String[] args){
		int x = 1;
		while(x < 3)
		{
			System.out.println("x="+x);
			x++;
		}
		
		/*
		 * while�����ϰ��
		 * ����1����ʾ1-10
		 */
		int i = 3;
		while(i<3)
		{
			System.out.println("i="+i);
			i++;
		}
		
		/*
		 * do-while:���������Ƿ����㣬ѭ��������ִ��һ��
		 */
		int j = 3;
		do
		{
			System.out.println("j="+j);
			j++;
		}
		while(j<3);
		
		// ����2����1-10�ĺ�
		/*
		 * ÿ���ظ��Ķ��Ǻ�+��һ����
		 * ����ȷ�����𣿲�ȷ������Ҫ����
		 * ��һ������ȷ�����𣿲�ȷ������Ҫ����
		 * ��+��һ�������ظ���˵����Ҫ���ִ�У���ѭ��
		 * ��һ���������й��ɵģ�����
		 */
		int k = 1,sum = 0;
		while(k < 11)
		{
			//System.out.println("sum="+sum);
			sum = sum + k;
			k++;
		}
		System.out.println("sum="+sum);
		
		/*
		 * for(��ʼ���ʽ��ѭ���������ʽ��ѭ����Ĳ������ʽ)
		 * {
		 * 		ִ����䣺��ѭ���壩
		 * }
		 */
		for(int s = 1; s < 3; s++)
		{
			System.out.println("s="+s);
		}
		//��while������
		//������������ͬ��for�ı��������������ѭ����
		
		/*
		 * ����ѭ��
		 * ����Դ��
		 * ������Դ���������ĳ������еȴ��������������Ż�ִ�У����Բ��ķ���Դ
		 * ��򵥵�����ѭ����
		 * while(true){}
		 * for(; ;){}
		 */
		
		/*
		 * ���󣺻�ȡ1-100֮��6�ı����ĸ���
		 * ˼·��1��������δ֪�ģ����Զ������
		 *     2��6�ı�����ʾ��ֻҪ�Ƕ�6������������6�ı���
		 *     3����Ҫ��1-100֮�����е�����Ҫ�����жϣ�����ǶԸ���������������
		 *     4��ʹ��ѭ��
		 *     
		 * ����
		       1�������������¼����
		       2������ѭ��������1-100
		       3����ѭ���ж�1-100�����ֽ����ж�
		       4������������������������
		 */
		
		//1�������������¼����
		int count = 0;
		for(int l = 1; l <= 100; l++ )
		{
			//����ֵ�����жϣ��Ƿ���6�ı���
			if(l%6 == 0)
			{
				count++;
			}
		}
		System.out.println("6�ı�������="+count);
		
		//forѭ��Ƕ��
		for(int q = 0; q < 3; q++){ //������
			for(int w = 0; w < 4; w++){ //����ÿһ�еĸ���
				System.out.print("*");
			}
			System.out.println(); //����			
		}
		System.out.println("--------");
		/*
		 * ��������Ļ����ʾ����ͼ��
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * ˼·��1��������ͼ�Σ���������5�����
		 *     2��ÿһ�ж��ж����
		 *     3�����У�ѭ�����Ը㶨����Ȥ���ǣ�ÿ��һ�У������ж���ǡ�
		 *       ѭ���ڣ���Ҫѭ��������ÿһ���ж��ٸ�*
		 *     4����ѭ��������������ѭ������ÿһ���ж��ٸ�*
		 * ���裺1��for��Ƕ��ѭ��
		 */
		
		int t = 5;
		for(int e=1; e <= 5; e++){
			for(int r = 1; r <= t; r++){
				System.out.print("*");
			}
			t--;
			System.out.println();
		}
		System.out.println("--------");
			
		//������ô��
		//u��o�仯һ�� --�� uֱ��д��x
			//int u = 1;
		for(int O=1; O <= 5; O++){
			for(int r = O; r <= 5; r++){
				System.out.print("&");
				}
				//u++;
				System.out.println();
		    }
		System.out.println("--------");
		/*
		 * $
		 * $$
		 * $$$
		 * $$$$
		 * $$$$$
		 */
		//int d = 1;
		for(int a = 1 ;a <= 5;a++){
			for(int s = 1; s <= a ;s++){
				System.out.print("%");
			}
			//d++;
			System.out.println();
		}

		/*
		 * break:���÷�Χ��switch��ѭ�����
		 */
		for(int g = 0; g<3; g++){
			if(g == 1)
				break;
			System.out.print("%");
		}
		
		outer:for(int h = 0; h<3; h++){
			inner:for(int b = 0;b<4;b++){
				System.out.print("%");
				break outer;
			}
		}
		System.out.println("--------");
		/*
		 * continue:���÷�Χ��ѭ�����
		 * ���ã���������ѭ���������´�ѭ��
		 */
		for(int p = 1; p<10; p++){
			if(p%2 == 0)
				continue;
			System.out.println("p="+p);
		}
		System.out.println("--------");
		
		outter:for(int h = 0; h<3; h++){
			innner:for(int b = 0;b<4;b++){
				System.out.println("h="+h);
				continue outter;
			}
		}
			
	}
}
