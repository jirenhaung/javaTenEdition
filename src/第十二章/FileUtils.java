package 第十二章;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {
	/**
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		copyFile(new File("E:\\java.txt"),new File("E:\\java1.txt") );
		//listDirectory(new File("D:\\�û�Ŀ¼\\����\\coreJava"));
	}
	public static void copyFile(File srcFile,File desFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ���"+srcFile+"������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"�����ļ�");
		}
		FileInputStream in=new FileInputStream(srcFile);
		FileOutputStream out=new FileOutputStream(desFile);
		byte [] buf=new byte[8*1024];
		int b;
		while((b=in.read(buf, 0, buf.length))!=-1){
			out.write(buf, 0, b);
			out.flush();
		}
		in.close();
		out.close();
	}
	
	public static void listDirectory(File dir)throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("Ŀ¼��"+dir+"������");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"����Ŀ¼");
		}
		File[] files=dir.listFiles();
		if(files!=null&&files.length>0){
			for (File file : files) {
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
	}
}
