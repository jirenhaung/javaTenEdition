package 测试;


public class test {
	private static final String X36 ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	//10����ת����36����
	public static String ConvertTo36(int val)
	{
	 String result ="";
	 while (val >= 36)
	{
	 result = X36.charAt(val%36)+ result;
	 val /= 36;
	}
	 if (val >= 0) result = X36.charAt(val) + result;
	 return result;
	}
	public static int ConvertTo10(String str)
	{
	 int result = 0;
	 int len = str.length();
	 for (int i = len; i > 0; i--)
	{
		 result+=X36.indexOf(str.charAt(i-1))*Math.pow(36, len-i);
		 //result += X36.IndexOf(str[i - 1]) * 
		 //Convert.ToInt32(Math.Pow(36, len - i));
	}
	 return result;
	}
	public static void main(String[] args) {
		System.out.println(ConvertTo36(99));
		System.out.println(ConvertTo10("2R"));
		
	}

}
