package 第九章;

public class TV {
	public static void main(String[] args) {
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		TV tv2=new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		System.out.println("tv1's channel is "+tv1.channel+" and volum level is "
		+tv1.volumeLevel);
		System.out.println("tv2's channel is "+tv2.channel+" and volum level is "
				+tv2.volumeLevel);
	}
	private int channel=1;
	private int volumeLevel=0;
	boolean on;
	public TV() {
		// TODO Auto-generated constructor stub
	}
	public void turnOn(){
		on=true;
	}
	public void turnOff(){
		on=false;
	}
	public void setChannel(int channel){
		if(on&&(channel>=1)&&(channel<=120))
			this.channel=channel;
	}
	public void setVolume(int volumeLevel){
		if(on&&(volumeLevel>=0)&&(volumeLevel<=7))
			this.volumeLevel=volumeLevel;
	}
	public void channelUp() {
		if(on&&(channel<120))
			channel++;
	}
	public void channelDown() {
		if(on&&(channel>1))
			channel--;
	}
	public void volumeUp() {
		if(on&&(volumeLevel<7))
			volumeLevel++;
	}
	public void volumeDown() {
		if(on&&(volumeLevel>=1))
			volumeLevel--;
		
	}
}
