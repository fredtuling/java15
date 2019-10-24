import java.util.Scanner;


public class lx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到游戏平台");
		System.out.println("请选择你喜爱的游戏\n\n");
		System.out.println("1.斗地主");
		System.out.println("2.连连看");
		System.out.println("3.王炸\n\n");
		System.out.print("请输入:");
		int week= input.nextInt();
		switch(week)
		{
		  case 1:
		        System.out.println("欢迎进入斗地主房间");
		        break;
		  case 2:
		        System.out.println("欢迎进入连连看房间");
		        break;
		  case 3:
		        System.out.println("欢迎进入王炸房间");
		        break;
		  default:
		        System.out.println("对不起，没有这个选项!");
		        break;
		}
		
		int i = 1;
		int js = 0;
		int cj = 0;
		String hp;
		do
		{
			System.out.println("您正在玩第"+i+"局成绩为:");
			cj =input.nextInt();
			i++;
			if(cj>80)
			{
				js++;
			}
			if(i>5)
			{
				System.out.print("游戏结束");
			}else
			{
				System.out.print("继续玩下一局吗？(yes/no) ");
				hp = input.next();
				if (hp.equals("no")) {
					System.out.print("您已经中途退出游戏。");
					break;
				} else {
					System.out.println("进入下一局");
				}
			}
	    }while (i <= 5);
		double bl = cj/80;
		if (i >5) {
			if (bl > 0.9) {
				System.out.println("\n恭喜！通过一级");
			} else if (bl > 0.6) {
				System.out.println("\n通过二级，继续努力！");
			} else {
				System.out.println("\n对不起，您未能晋级，继续加油啊！");
			}
		} else {
			System.out.println("\n对不起，您未能晋级，继续加油啊！");
		}
		
}
}


