package 第七章;

public class lizi7_2_216 {
	public static void main(String[] args) {
		int []deck=new int [52];
		String [] huase={"����","����","÷��","����"};
		String [] shuzi={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i=0;i<deck.length;i++)
		{
			deck[i]=i;
		}
		for(int i=0;i<deck.length;i++)
		{
			int index=(int)(Math.random()*deck.length);
			int temp=deck[i];
			deck[i]=deck[temp];
			deck[index]=temp;
		}
		/*for(int i=0;i<4;i++)
		{
			String suit=huase[deck[i]/13];
			String rank=shuzi[deck[i]%13];
			System.out.println("Card number "+deck[i]+":"+rank+" of "+suit);
		}*/
		for(int i=0;i<4;i++)
		{
			int charnumber=(int)(Math.random()*deck.length);
			String suit=huase[charnumber/13];
			String rank=shuzi[charnumber%13];
			System.out.println("Card number "+charnumber+":"+rank+" of "+suit);
		}
	}
}
