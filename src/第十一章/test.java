package 第十一章;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
	 public static void main(String[] args) {
	        two t = new two();
		 	//one t = new two();
	        t.printABC();
	    }
}
class one{
	protected void printA(){
		System.out.println("����A");
	}
	private void printB(){
		System.out.println("����B");
	}
	private void printC(){
		System.out.println("����C");
	}
	 protected void printABC() {
	        printA();
	        printB();
	        printC();
	    }
}
class two extends one{
	protected void printA() {
        System.out.println("����A");
    }

    protected void printB() {
        System.out.println("����B");
    }
    
    public void printC() {
        System.out.println("����C");
    }
   
}