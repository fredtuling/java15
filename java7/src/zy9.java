import java.util.Scanner;


public class zy9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("������ѧ������Ŀ:");
		int sm = in.nextInt();
		if(sm==1)
		{
			System.out.print("ѧ��Ϊһ��,���ֽ�������");
			
		}
		else
		{
			System.out.print("�������");
			
		}
		int cj=0;
		int rs = 0;
		for(int i=0;i <5;i++)
		{
			System.out.print("\n�������"+(i+1)+"�ųɼ�:");
			cj = in.nextInt();
			rs = rs + cj;
		}
		double pzcj = rs/5;
		System.out.print("�ܳɼ�����="+rs+"\tƽ���ɼ�����="+pzcj);

	}

}
