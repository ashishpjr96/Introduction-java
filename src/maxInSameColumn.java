import io.netty.util.internal.SystemPropertyUtil;

public class maxInSameColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int b[][]= {{2,3,6},{9,1,4},{0,5,6}};
		  int min= b[0][0];
		  int mincolumn=0;
		  for(int i=0;i<b.length;i++)
		  {
			  for(int j=0;j<b.length;j++)
			  {
				  if(b[i][j]<min)
				  {
					  min=b[i][j];
					   mincolumn = j;
					  
				  }
			  }
		  }
		 
		int max=b[0][mincolumn];
		  int k=0;
		  while(k<b.length)
		  {
			  if(b[k][mincolumn]>max)
			  {
				  max=b[k][mincolumn];
			  }
			  k++;
		  }
		  System.out.println(max);
	}

}
