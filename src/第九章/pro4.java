package 第九章;
import java.util.Random;
public class pro4 {
	public static void main(String[] args) {
		Random random=new Random(1000);
		int count=0;
		for(int i=0;i<50;i++){
			count++;
			if(count%10==0)
				System.out.println(random.nextInt(100));
			else
				System.out.printf("%-2d%1s", random.nextInt(100)," ");
			
		}
	}
}
