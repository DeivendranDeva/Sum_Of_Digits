package payilgam;
 class GrandFather
{

 public void first()
 {
  int row=1;
  while(row<=5)
   {
   int col=1;
   while(col<=5)
     {
	 if(row==col || row+col==6) 
	 {	 
     System.out.print("*");
     }
     else 
     {
	  System.out.print(" "); 
     }
	 col++;
     }
     System.out.println();
     row++;
   }   
 }
}

 class Father extends GrandFather
{
	public void second ()
	{	          
		 int a=1;
		 for(int row=1;row<=4;row++)
		{
			a=row;
			for(int col=1;col<=3;col++)
			{		 
			 System.out.print(a+" ");	
			 a=a+4;
			}
			System.out.println();
		}	 
	}
}

public class Son extends Father
{ static int a;
	public static void main(String args[])
	{
		Son obj = new Son();
		Father obj1= new Father();
		GrandFather obj2 = new GrandFather();
		obj2.first();
		obj1.second();
		obj1.second();
		obj.first();
		obj.second();
		obj.third();
	}
		public void third() {
		//int a=1;
		for(int row=1;row<=3;row++)
		{
			//int a=row; 
			//a=row;
			for(int col=1;col<=3;col++)
			{			     
			 System.out.print(a+"    ");	
			 a=a+2;
			}
			System.out.println();
		}
}
}
