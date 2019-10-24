import java.util.*;
public class zy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份:");
		int zs=input.nextInt();
		if((zs%4== 0 && zs%100!=0) || (zs%400 == 0))
		{
			System.out.println("闰年");
		}
		else
		{
			System.out.println("平年");
		}
	}

}
