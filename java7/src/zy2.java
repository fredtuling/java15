import java.util.*;
public class zy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int zs1 = input.nextInt();
		System.out.println("请输入第二个数：");
		int zs2 = input.nextInt();
		System.out.println("请输入第三个数：");
		int zs3 = input.nextInt();
		if(zs1>zs2 )
		{
			System.out.println("最大值"+zs1);
		}
		else if(zs2>zs3 && zs3>zs2)
		{
			System.out.println("最大值"+zs2);
		}
		else
		{
			System.out.println("最大值"+zs3);
		}
	}

}
