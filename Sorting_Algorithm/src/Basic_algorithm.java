import java.util.*;
public class Basic_algorithm {

	Scanner sc=new Scanner(System.in);
	public Basic_algorithm() {
		
	}
	//============================================================================
	public void bubblesort()
	{
		System.out.println("Enter the No of element you want to insert");
		int n=sc.nextInt();
		System.out.print("Accpet input data");
		int arr_ip[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr_ip[i]=sc.nextInt();
		}
		
		System.out.println("Input  Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr_ip[i]+" ");
		}
		int temp=0;
		System.out.println("========================");
	System.out.println("Step by step by Execution");
	System.out.println("");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<(n-i-1);j++)
				{
					if(arr_ip[j]>arr_ip[j+1])
					{
						temp=arr_ip[j];
						arr_ip[j]=arr_ip[j+1];
						arr_ip[j+1]=temp;
						
					}
				}
				
				for(int m=0;m<n;m++)
				{
				 System.out.print(arr_ip[m]+" ");	
				}
				System.out.println(" ");
			}
			
			System.out.println("========================");
			System.out.println("Output Array");
			for(int i=0;i<n;i++)
			{
				System.out.print(arr_ip[i]+" ");
			}
	}
	
	public void insertionsort()
	{
		System.out.println("Enter the No of element you want to insert");
		int n=sc.nextInt();
		System.out.print("Accpet input data");
		int arr_ip[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr_ip[i]=sc.nextInt();
		}
		
		System.out.println("Input  Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr_ip[i]+" ");
		}
		
	int temp,position;
	for(int i=1;i<n;i++)
	{
	 temp=arr_ip[i];
      position=i;
	      while(arr_ip[position-1]>=temp && position>0)
	      {
	    	  arr_ip[position]=arr_ip[position-1];
	    	  position=position-1;
	      }
        arr_ip[position]=temp;
	
     }	
	System.out.println("OUTPUT");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr_ip[i]);
	}
		
	}
	//============================================================================
	

}
