
public class FlowControl {
	public static void main(String[] args){
		//��ʽһ��if
		int x = 1;
		if(x > 1){
			System.out.println("yes");
		}
		System.out.println("good");
		
		//��ʽ����if - else
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
		//if - else����Ԫ��������񣬿������Ϊ��Ԫ�������if-else�ļ�д��ʽ
		/* ����
		 * �׶ˣ�����������if-else��������Ԫ�������д
		 * ԭ����Ϊ��Ԫ���������������н����if-else���Ǳ����н��
		 */
		
		//��ʽ����if - else if - else
		/* if(�������ʽ)
		 * {
		 *    ִ�����;
		 * }
		 * else if
		 * {
		 *    ִ�����;
		 * }
		 * ......
		 * else
		 * {
		 *    ִ�����;
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
		 * ���󣺸����û��ĸ�������ֵ����ʾ����ֵ��Ӧ�����ڡ��磺2�����ڶ�
		 * ˼·��
		 *    1��զ��ȡ�����ֵ�أ���Դ�кܶ࣬��ȷ����ֻҪ��ȷ�������ݣ����ñ����洢��ֻҪ���������������
		 *    2����ֵ��ȷ���������ʾ��Ӧ�������أ��Ǿ���Ҫ�Ը���ֵ�����ж�
		 *    3��զ��ʾ�أ�ͨ��������Ϳ�����ʾ����Ļ��
		 *    
		 * ���裺
		 *    1�������������¼����
		 *    2��ͨ���жϽṹ���if�Ըñ��������ж�
		 *    3�����ݲ�ͬ��������ͨ����������ʾ��ͬ�Ľ��
		 */
		
		//1�������������¼����
		int week = 3;
		
		//2��ͨ���жϽṹ���if�Ըñ��������ж�
		
		
		//3�����ݲ�ͬ��������ͨ����������ʾ��ͬ�Ľ��
	}
}

class SwitchDemo{
	public static void main(String[] args){
		/*
		  switch(���ʽ)
		  {
		  	  case ȡֵ1��
		  	                ִ����䣻
		  	      break��
		      case ȡֵ2��
		  	             ִ����䣻
		  	    break��
		  	   ...
		  	   default:
		  	           ִ����䣻
		  	    break��
		  }
		 */
		/*
		 *  switch����ص㣺
			1���𰸵���дû��˳��
			2��ƥ��Ĵ𰸱�ִ�У�һֱִ�е�break��������ִ�е�switch������
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
