import java.util.Scanner;


public class zy9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入学生的数目:");
		int sm = in.nextInt();
		if(sm==1)
		{
			System.out.print("学生为一名,名字叫王敬则");
			
		}
		else
		{
			System.out.print("输入错误");
			
		}
		int cj=0;
		int rs = 0;
		for(int i=0;i <5;i++)
		{
			System.out.print("\n请输入第"+(i+1)+"门成绩:");
			cj = in.nextInt();
			rs = rs + cj;
		}
		double pzcj = rs/5;
		System.out.print("总成绩等于="+rs+"\t平均成绩等于="+pzcj);

	}

}
