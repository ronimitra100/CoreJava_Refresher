package CoreJavaDemo;

public class ReverseString {
	public static void main(String[] args){
		String s = "rahul";
		String t = "";
		for (int i=s.length()-1; i>=0; i--){
			t += s.charAt(i);
		}
		System.out.println(t);
		
		if (t.equals(s)){
			System.out.println("It's a palindrome.");
		}
		else {
			System.out.println("It's not a palindrome.");
		}
		
		System.out.println(reverseString("roni"));
	}
	
	public static String reverseString(String s){
		String t="";
		for (int i=(s.length()-1); i>=0; i--){
			t += s.charAt(i);
		}
		return t;
	}
	

}
