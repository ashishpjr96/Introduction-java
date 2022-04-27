package pattern;

public class pyramid3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		 for(int i=0; i<4;i++)
		 {
			 
			 for (int j=1;j<=i;j++)
			 {
				 System.out.print(k*3);
				 k++;
				 System.out.print("\t");
			 }
			 System.out.println(" ");
		 }
		
		 
	}

}
