import java.util.*;
public class zy4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("��������ӻ��ļ۸�");
		int dsj = input.nextInt();
		System.out.print("���������ļ۸�");
		int bx = input.nextInt();
		double zj = dsj + bx;
		if(zj>5000)
		{
			 zj = zj*0.7;

		}
		else if(zj>=1000)
		{
			 zj = zj*0.8;
		}
		else if(zj>=100)
		{
			 zj = zj*0.9;
		}

		System.out.print("�ܼ۸�"+zj);
	}

}
