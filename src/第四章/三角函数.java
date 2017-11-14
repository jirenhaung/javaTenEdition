package 第四章;

public class 三角函数 {
	public static void main(String[] args) {
		System.out.println(Math.sin(Math.PI/6));//�����Ի���Ϊ��λ������ֵ
		System.out.println(Math.cos(Math.PI/3));//�����Ի���Ϊ��λ������ֵ
		System.out.println(Math.tan(Math.PI/3));//�����Ի���Ϊ��λ������ֵ
		System.out.println(Math.toDegrees(Math.PI/6));//�ѻ�����תΪ�Ƕ�
		System.out.println(Math.toRadians(90));//�ѽǶ�תΪ����
		System.out.println(Math.toDegrees(Math.acos(0.5)));//�ȷ����Ǻ������ٰѻ�����תΪ�Ƕ�
		System.out.println(Math.toDegrees(Math.asin(0.5)));
		System.out.println(Math.toDegrees(Math.atan(Math.pow(3, 0.5))));
	}
}
