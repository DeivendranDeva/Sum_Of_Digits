package payilgam;

public class Digits2 
{
	public static void main(String arg[]) 
	 {
	 int row=1;
	 while(row<=4)
	 {	
	   int col=1;
	   while(col<=4)
	   {	   	 
        if(row==col)  
        {
         System.out.print(row+"  ");
        }
        else if(row+col==5)
        {
         System.out.print(col+"  ");	
        }
        else 
        {
         System.out.print("* ");
        }		
		col++;	
	   }
	  
	   System.out.println();	   
	   row++;
	 } 		 
	 }
}
