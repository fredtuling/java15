import java.util.*;
public class Lx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rs = 0;
		int nl = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.print("�������" +(i+1)+ "λ�˿͵����䣺");
			nl = input.nextInt();
			if(nl > 0 && nl <=30){
				rs++;
			}
		}
			
	}

}
  