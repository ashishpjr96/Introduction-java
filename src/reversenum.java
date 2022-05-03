
public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int num=12345678;
		     
		      String str=  Integer.toString(num);
		      
		     int ln=  str.length();
		      
		   
		    char  ch[]=  str.toCharArray();
		    
		    String rev ="";
		      for (int i=ch.length-1; i>=0;i--)
		      {
		    	  rev=rev+ch[i];
		    	  
		      }
		      
		      int reversenum= Integer.parseInt(rev);
		      System.out.println("reverse numer is " + reversenum);
		     
	}

}
