
public class splitstring {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * String str=" 2  i'am Ashish";
		 * 
		 * String str1[]=str.split("i'am");
		 * 
		 * int a=Integer.parseInt(str1[0].trim());
		 * 
		 * System.out.println(a);
		 * 
		 * int c= a+3;
		 * 
		 * System.out.println(c); System.out.println(str1[0].trim());
		 * System.out.println(str1[1].trim());
		 */
		
		String str= "Ashish Poojary is strong ";
		
		       String str1[]=str.split(" ");
		           String str2 = str1[1].trim();
		           
		           System.out.println(str2);
		           
		           int ln=str2.length();
		           
		           
		           char ch[]=new char[ln];
		           
		           for(int i=0;i<ch.length;i++)  //this loop is to iterate elemts of str into ch
		           {
		        	   ch[i]=str2.charAt(i);
		        	   
		        	  // System.out.println(ch[i]);
		           } 
		            for(int j=0;j<ch.length;j++)   //  this loop is for interating elements of ch
		            {
		               int c=0;
		             for (int k=0;k<ch.length;k++)   // this loop is for comparinmg
		             {
		            	 if(ch[j]==ch[k])
		            	 {
		            		 c++;
		            	 }
		             }
		     System.out.println("count of "+ch[j]+ "is"+c);
		           }
	}
}