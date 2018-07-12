import java.lang.*;

class ReverseString {
	public static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--){
			reverse += str.charAt(i);
		}
		return reverse;
	}
	public static void main (String [] args){
		String toBeReversed = new String("I <3 Tunisia");
		System.out.println("The string: " + toBeReversed + " becomes " + reverseString(toBeReversed));
	}
}