package 测试;

class x{
	Y b=new Y();
	public x() {
		System.out.println("x");
	}
}
class Y{
	Y(){
		System.out.println("Y");
	}
}
public class fs extends x{
	
	public fs() {
		System.out.println("fs");
	}Y y=new Y();
	public static void main(String[] args) {
		new fs();
	}

}
