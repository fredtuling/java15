import java.util.Scanner;


public class lx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ������Ϸƽ̨");
		System.out.println("��ѡ����ϲ������Ϸ\n\n");
		System.out.println("1.������");
		System.out.println("2.������");
		System.out.println("3.��ը\n\n");
		System.out.print("������:");
		int week= input.nextInt();
		switch(week)
		{
		  case 1:
		        System.out.println("��ӭ���붷��������");
		        break;
		  case 2:
		        System.out.println("��ӭ��������������");
		        break;
		  case 3:
		        System.out.println("��ӭ������ը����");
		        break;
		  default:
		        System.out.println("�Բ���û�����ѡ��!");
		        break;
		}
		
		int i = 1;
		int js = 0;
		int cj = 0;
		String hp;
		do
		{
			System.out.println("���������"+i+"�ֳɼ�Ϊ:");
			cj =input.nextInt();
			i++;
			if(cj>80)
			{
				js++;
			}
			if(i>5)
			{
				System.out.print("��Ϸ����");
			}else
			{
				System.out.print("��������һ����(yes/no) ");
				hp = input.next();
				if (hp.equals("no")) {
					System.out.print("���Ѿ���;�˳���Ϸ��");
					break;
				} else {
					System.out.println("������һ��");
				}
			}
	    }while (i <= 5);
		double bl = cj/80;
		if (i >5) {
			if (bl > 0.9) {
				System.out.println("\n��ϲ��ͨ��һ��");
			} else if (bl > 0.6) {
				System.out.println("\nͨ������������Ŭ����");
			} else {
				System.out.println("\n�Բ�����δ�ܽ������������Ͱ���");
			}
		} else {
			System.out.println("\n�Բ�����δ�ܽ������������Ͱ���");
		}
		
}
}


