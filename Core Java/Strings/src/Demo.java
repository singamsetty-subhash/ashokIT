/*
 * Demo program using all operations in strings 
 */
public class Demo {

	public static void main(String[] args) {
		//equality operator(==)
		String str1= new String("ashokit");
		String str2= new String("ashokit");
		System.out.println("str1==str2="+(str1==str2));
		//equals operator(=)
		String str3="hello" ;
		String str4= new String("hello");
		System.out.println("str3.equals(str4)="+str3.equals(str4));
		//replaceAll
		String creadit_card="1234-5678-7890-2345";
		String result=creadit_card.replaceAll("[^-] (?={4})","(X)");
		System.out.println(result);
		//substring
		String str5="the cat sat on the mat";
		String str6=str5.substring(4,7);
		System.out.println("substring="+str6);
		//join 
		String[] str7= {"I","AM","IN","CLASS"};
		String str8=String.join(" ",str7);
		System.out.println("joined String="+str8);
		
	}

}
