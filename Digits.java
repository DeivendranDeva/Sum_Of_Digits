package payilgam;

public class Digits 
{
	public static void main(String arg[]) 
	 {
		Digits obj=new Digits();
		       obj.compact();
	 }
	public void compact() {	
	 int row=1;
	 while(row<=3)
	 {
	   int i=1;
	   int j=0; 
	   int col=1;
	   while(col<=2)
	   {	   
		System.out.print(i+" "); 
		System.out.print(j+" ");
		col++;	
       
	   while(col<=2){
			        int m=1;
			        int n=0;
			        col++;
			        System.out.print(m+" ");
			 	    System.out.print(n+" ");			 	  
	                }
	   System.out.println();
	  
	   }
	   row++;
	 } 	
	
	 
	 }
}
