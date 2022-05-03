
public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sf = new StringBuffer("MADAM1");
		String original = sf.toString();

		String reveresed = sf.reverse().toString();

		System.out.println("reversed string is " + reveresed);

		if (reveresed.contentEquals(original)) {
			System.out.println("given string is palindrome ");
		} else {
			System.out.println("Given string is not palindrome ");
		}

	}

}
