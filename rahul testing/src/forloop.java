import java.util.ArrayList;

public class forloop {
	public static void main(String[]args)
	{
		//int[] arr= {1,2,3,4,5,6};
	
	
	//for (int i=0; i<arr.length;i++)
		
		//System.out.println(arr[i]);
		
		//String[] name= {"mahesh","vasu","aru"};
		
		//for (int i=0; i<name.length; i++)
			
			//System.out.println(name[i]);
		
		//ArrayList<String> a= new ArrayList<String>();
		//a.add("mahesh");
		//a.add("simha");
		//a.add("gavinda");
		
		//System.out.println(a.get(0));
		//System.out.println(a.get(1));
		
		String s= "Rahul shetty accademy";
		String [] splittedString = s.split("shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
			
		}
		
		
		
		
		
	
	
	}
}
