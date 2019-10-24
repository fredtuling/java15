import java.util.*;
public class zy4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入电视机的价格：");
		int dsj = input.nextInt();
		System.out.print("请输入冰箱的价格：");
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

		System.out.print("总价格："+zj);
	}

}
