package 第九章;
import java.util.Date;
public class pro_6 {
	public static void main(String[] args) {
		Date date=new Date();
		StopWatch stopWatch=new StopWatch(date);
		System.out.println(stopWatch.getStareTime());
		int j=0;
		for(int i=0;i<100000;i++){
			j++;
		}
		System.out.println(stopWatch.stareTime());
		for(int i=0;i<10000000;i++){
			j++;
		}
		Date date2=new Date();
		System.out.println(stopWatch.endTime(date2));
		System.out.println(stopWatch.getElapsed());
	}
}
class StopWatch{
	private long stareTime;
	private long endTime;
	public StopWatch(Date i){
		stareTime=i.getTime();
	};
	public long getStareTime(){
		return this.stareTime;
	}
	public long stareTime(){
		Date date=new Date();
		return stareTime=date.getTime();
	}
	public  long endTime(Date i){
		return endTime=i.getTime();
	}
	public long getElapsed(){
		return endTime-stareTime;
	}
}
