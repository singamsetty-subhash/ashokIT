//parent class
public class Parent {
private String camara;
private String lenstype;

public Parent(String camara, String lenstype) {
	super();
	this.camara = camara;
	this.lenstype = lenstype;
}
public String getCamara() {
	return camara;
}
public void setCamara(String camara) {
	this.camara = camara;
}
public String getLenstype() {
	return lenstype;
}
public void setLenstype(String lenstype) {
	this.lenstype = lenstype;
}
void parent_display()
{
	System.out.println(camara+" camara with lens "+lenstype+" image captured");
}
}
