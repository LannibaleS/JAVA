
public class MethodDemo {
	public static void main(String[] args){
		int row = 4;
	    int col = 5;
	    //�����Զ���ķ���
	    draw(row,col);
	    
	    int sum = add(2,5);
	    System.out.println(sum);
	    
	    printCFB(3);
	}  


//public static(���η�) void(����ֵ����) draw(������) (int row, int col){
/* 	ִ����䣻
 *  return ����ֵ;  //return�ؼ��������ڽ����ù��ܡ���������ľ��������ظ�������
    }
            ע�⣺�����ķ���ֵ���������voidʱ��return������ʡ�ԡ�return;
        void��ʾ����û�з���ֵ�����
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

/* ��ζ���һ�������أ�
 * ��������һ������
 * ���ܾ���Ҫ������
 * 1�����    2��δ֪����
 * ��ȷ1��������ܵĽ����ʲô��
 *      ��ʵ������ȷ����ֵ����
 * ��ȷ2�����������Ҫ��δ֪������ʲô��
 *      ��ʵ������ȷ�����б�
 */

/*
 * ����:��Ҫһ�����������мӷ����㣬��ȡ���������ĺ�
 * ��ȷ1�����ܵĽ����ʲô�أ���һ���ͣ���������������ֵ����Ϊint
 * ��ȷ2�����ܵ�δ֪���������У������ͱ�����������int���ͣ�����ǲ����б�
 */
public static int add(int x, int y){
	return x+y;
}

//���������أ�������99�˷���
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