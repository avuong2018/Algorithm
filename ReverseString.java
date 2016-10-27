
public class ReverseString {
	public static void main(String[]args){
		String target = "abcdef";	
		String str = new StringBuffer(target).reverse().toString();		
		System.out.println(str);		
	}
}
