package 第十二章;

//import javax.swing.OverlayLayout;

public class user {
	public static void main(String[] args) {
		/*try{
			int value=50;
			if(value<40)
				throw new Exception("valueis too small");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("continue after the catch block");*/
		try{
			System.out.println(sum(new int []{1,2,3,4,5}));
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("\n"+ex.getMessage());
			System.out.println("\n"+ex.toString());
			
			System.out.println("\nTrace Info Obtained from qetStacckTrace");
			StackTraceElement[] traceElements=ex.getStackTrace();
			for (int i = 0; i < traceElements.length; i++) {
				System.out.println("method "+traceElements[i].getMethodName());
				System.out.println("("+traceElements[i].getClassName()+":");
				System.out.println(traceElements[i].getLineNumber()+")");
			}
		}
	}
	private static int sum(int []list){
		int result=0;
		for (int i = 0; i <= list.length; i++) {
			result+=list[i];
		}
		return result;
	}
}
