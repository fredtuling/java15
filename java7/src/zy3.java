import java.util.*;
public class zy3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个公里数：");
		int gl = input.nextInt();
		int yf = 2;
		double zj = gl*yf;
		
		if(gl>500){
		System.out.println("总价为："+zj*0.8+"元");
		}
		
		else if(gl<500 && gl>100){
			System.out.println("总价为："+zj*0.9+"元");
			}
		
		else{
			System.out.println("总价为："+zj+"元");
			}
	}

}
