
public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	 int a[]= {2,3,4,6,4,8};
		 
		 for(int i=a.length-1;i>=0;i--)
		 {
			 
			 {
				 System.out.println(a[i]);
			 }
		 }
	}*/

		
		 int a[][]= {{1,2,5},{8,2,4},{1,7,9}};
		 for(int i=a.length-1;i>=0;i--)
		 {
			 for(int j=a.length-1;j>=0;j--)
			 {
				 System.out.println(a[i][j]);
			 }
		 }
}
}
