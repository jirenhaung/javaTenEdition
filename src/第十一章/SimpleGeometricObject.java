package 第十一章;

public class SimpleGeometricObject {
	private String color="white";
	private boolean filed;
	private java.util.Date dateCreated;
	public SimpleGeometricObject(){
		dateCreated=new java.util.Date();
	}
	public SimpleGeometricObject(String color,boolean filed){
		dateCreated=new java.util.Date();
		this.color=color;
		this.filed=filed;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public boolean getFiled(){
		return filed;
	}
	public void setFiled(boolean filed){
		this.filed=filed;
	}
	public java.util.Date getDate(){
		return dateCreated;
	}
	public String toString(){
		return "created on"+dateCreated+"\ncolor: "+color+" and filed: "+filed;
	}
}
