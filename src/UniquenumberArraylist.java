import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class UniquenumberArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> num= Arrays.asList(1,3,3,4,4,5,1);
		
		int count;
		 int unique=0;
		 
		 for(int i=0;i<num.size();i++)
		 {
			 count =0;
			 {
				 for(int j=0;j<num.size();j++)
				 {
					if(num.get(i)==num.get(j))
					{
						count++;
					}
					if(count==1 && j==num.size()-1)
					{
						unique=num.get(i);
					}
				 }
			 }
			
		 }
		
		  
	

System.out.println(unique);
	}
}
