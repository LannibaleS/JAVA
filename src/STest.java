/*
 *  switch��if������
	1��if���������ж���ֵ��Ҳ�����ж�����
                   ֻҪ��������Boolean���ͣ������Խ����ж�
	2��Switch���ڶԹ̶��ļ���ֵ�������жϡ��жϵ�ֵ����������

 */
public class STest {
	public static void main(String[] args){
		int y = 9;
		
		switch(y){
		case 1:
			System.out.println(y+"��Ӧ��������һ");
			break;
		case 2:
			System.out.println(y+"��Ӧ�������ڶ�");
			break;
		case 3:
			System.out.println(y+"��Ӧ����������");
			break;
		case 4:
			System.out.println(y+"��Ӧ����������");
			break;
		case 5:
			System.out.println(y+"��Ӧ����������");
			break;
		case 6:
			System.out.println(y+"��Ӧ����������");
			break;
		case 7:
			System.out.println(y+"��Ӧ����������");
			break;
		default:
			System.out.println(y+"��Ӧ����null");
			break;
		}
	}
}
