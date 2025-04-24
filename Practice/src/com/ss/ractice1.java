package com.ss;

public class ractice1 
{
	
	private int id;
	private String name;
	
	public ractice1() {}
	
	

	public ractice1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public ractice1(ractice1 s) {
		super();
		this.id = s.id;
		this.name = s.name;
	}




	public static void main(String[] args) 
	{
		
		ractice1 obj = new ractice1(101,"Amit");
		System.out.println(obj.name);
		ractice1 obj2 = new ractice1(obj);
		obj.name="Sumit";
		System.out.println(obj.name);
		
		
		
//		String password;
//		
//		Scanner sc = new Scanner(System.in);
//		  do
//		  {
//			  System.out.println("Enter assword");
//			   password = sc.nextLine();
//			  
//		  }while(!password.equals("1234"));
//		  {
//			  System.out.println("access granted");
//		  }
//		
		
	/*================================================================================================	*/
//		
//		 String a = "hello world hy";
//		 StringTokenizer token = new StringTokenizer(a, " ");
//		 while(token.hasMoreTokens())
//		 {
//			 System.out.println(token.nextToken());
//		 }
//		
		
		/*===============================================================================================*/
		
//		
//		String name = "Shivajeet";
//		
//		for(char a : name.toCharArray())
//		{
//			System.out.println(a);
//		}
//		
		
		/*======================================================================================================*/
		
		
//		int [] [] data = {
//				
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//				
//		};
//		
//		for(int i =0;i<data.length;i++)
//		{
//			for(int j=0;j<data[i].length;j++)
//			{
//				System.out.print(data[i][j]);
//			}
//			System.out.println();
//		}
//		
		
		/*========================================================================================================*/
		
		
		
		
		
	}

}
