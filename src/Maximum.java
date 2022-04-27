
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		int a[]= {44,46,23,99};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
