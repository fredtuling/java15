import java.util.*;
public class zy3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����������");
		int gl = input.nextInt();
		int yf = 2;
		double zj = gl*yf;
		
		if(gl>500){
		System.out.println("�ܼ�Ϊ��"+zj*0.8+"Ԫ");
		}
		
		else if(gl<500 && gl>100){
			System.out.println("�ܼ�Ϊ��"+zj*0.9+"Ԫ");
			}
		
		else{
			System.out.println("�ܼ�Ϊ��"+zj+"Ԫ");
			}
	}

}
