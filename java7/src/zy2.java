import java.util.*;
public class zy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int zs1 = input.nextInt();
		System.out.println("������ڶ�������");
		int zs2 = input.nextInt();
		System.out.println("���������������");
		int zs3 = input.nextInt();
		if(zs1>zs2 )
		{
			System.out.println("���ֵ"+zs1);
		}
		else if(zs2>zs3 && zs3>zs2)
		{
			System.out.println("���ֵ"+zs2);
		}
		else
		{
			System.out.println("���ֵ"+zs3);
		}
	}

}
