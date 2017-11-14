package 第十二章;

public class test {
	public static void main(String[] args) {
		 Two t = new Two();
		 One t1= new Two();
	        t.printABC();
	 //       t1.printABC();
	}
}

class Two extends One {
    protected void printA() {
        System.out.println("����printA");
    }

    private void printB() {
        System.out.println("����printB");
    }
    
    public void printC() {
        System.out.println("����printC");
    }

}
class One {
    protected void printA() {
        System.out.println("����printA");
    }

    private void printB() {
        System.out.println("����printB");
    }
    
    private void printC() {
        System.out.println("����printC");
    }

    protected void printABC() {
        printA();
        printB();
        printC();
    }
}