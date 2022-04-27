
public class Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int a[][] = { {4,7,4},{2,3,9}};
		
		int min=a[0][0];
		 for(int i=0;i<a.length;i++) 
		 {
			 for(int j =0;j<a.length;j++)
			 {
				 if(a[i][j]<min)
				 {
					 min=a[i][j];
				 }
			 }
		 }
		 System.out.println(min);
	}

}
