//child class
public class Child extends Parent {
private int resolution;
private int storage;
public Child(String camara,String lenstype,int resolution, int storage) {
	super(camara,lenstype);
	this.resolution = resolution;
	this.storage = storage;
}
void display() {
	System.out.println(getCamara()+" camara with lens "+getLenstype()+" with resolution "+
			resolution +" MP with Storage Capasity of "+storage+"GBs, vedio Captured!");

}

}
