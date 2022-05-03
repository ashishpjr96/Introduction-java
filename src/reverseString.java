
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * String str ="dog";
		 * 
		 * int len= str.length();
		 * 
		 * char ch []=new char [len];
		 * 
		 * for (int i=len-1;i>=0;i--) {
		 * 
		 * char ch1= str.charAt(i);
		 * 
		 * System.out.println(ch1); }
		 * 
		 */
		
		 String str ="dog";
		 
		    int len=str.length();
		    
		   char ch []= str.toCharArray();
		   String rev="";
		   
		   
		   for( int i=len-1; i>=0;i--)
		   {
			   
			   rev=rev+ch[i];
			   
			   
		   }
		   
		   System.out.println( "reversed string is " +rev);
	}
	
}
