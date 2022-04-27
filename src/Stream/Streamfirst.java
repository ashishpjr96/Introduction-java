package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Streamfirst {

	// count the number of names starts with letter "A"
	//@Test
	public void regular()
	{
		ArrayList<String>names =new ArrayList<String>();
		
		names.add("Ashish");
		names.add("Abhijith");
		names.add("divya");
		names.add("Ashu");
		int count =0;
		for(int i=0;i<names.size();i++)
		{
			String Actual = names.get(i);
			if (Actual.startsWith("A"))
			{
				count  ++;	
				}
			
		}
		System.out.println(count);
	}
	
	//@Test
	public void  streamFilter()
	{
		ArrayList<String> names=new  ArrayList<String>();
		names.add("Ashish");
		names.add("Abhijith");
		names.add("divya");
		names.add("Ashu");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(c);
		
	// using stream
	long d=Stream.of("Ashish","AShu","Abhi","Raj").filter(s->
	{
		s.startsWith("A");
		return true;
	}).count();
	
	System.out.println(d);
	
	}
	//print all namesof arraylist which conatins > 4 letter
	// @Test 
	 public void streamPrint() {
		 ArrayList<String> names=new  ArrayList<String>();
			names.add("Ashish");
			names.add("Abhijith");
			names.add("div");
			names.add("Ashui");
			
			//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			
			//print first name with > 4 letter 
			names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
			
		 
	 }
	 
	// @Test 
	 public void StreamMap()
	 {
		//print which have last leteer "a" with upper case
		 //map is used here to manipulate the stream
		 Stream.of("Ashisha","ASha","Abhi","Raja").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		 .forEach(s->System.out.println(s));
	 }
	 //@Test
	 public void StreamMap2()
	 {
		 //print names which have first letter as "A" with upper case and sorted
		List<String> name= Arrays.asList("Ashisha","Aha","Abhi","Raja");
		
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));	 }
	 
	 // mergeing two streams
	//@Test
	public void streamMerge()
	{
		 ArrayList<String> names=new  ArrayList<String>();
			names.add("Man");
			names.add("Women");
			names.add("div");
			
			List<String> name= Arrays.asList("Ashisha","Aha","Abhi","Raja");
			
			name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));	 
			
			
		Stream<String> newStream=Stream.concat(names.stream(), name.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		
		//checck if Abhi is presnt  on the name
		
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("abhi77sps"));
		System.out.println(flag);

		Assert.assertTrue(flag);
	}
	
	    @Test 
	    public void streamCollect() {
	    	
	    	List<String> name= Arrays.asList("Ashisha","Aha","Abhi","Raja");
	    	
	    	List <String> listname=name.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
	    	
	        System.out.println( listname.get(0));
	        
	        //p=rint unique number  from array
	        //sort the array -get 3rd index
	        int a[]={1,2,3,3,4,78,8};
	       List<Integer> number= Arrays.asList(1,2,3,3,4,78,8);
	                 number.stream().distinct().sorted().forEach(s->System.out.println(s));
	     // List<Integer> unique=  number.stream().distinct().sorted().collect(Collectors.toList());
	    //  System.out.println(unique.get(2));
	        
	       
	       
	        
	    }
			
	}
	
