package payilgam;

public class RowColumn 
{
 public static void main(String arg[]) 
 {
	 int i=5;   //By giving this we get 5 to 60 till 3*4 matrix plac
 int row=1;
 while(row<=3)
 {
  // int i=5;   //By giving this we get 5 10 15 20 for every three line
   int col=1;
   while(col<=4)
   {	   
	System.out.print(i+" "); 
	col++;
    i=i+5;
   }    
   System.out.println();
   row++;
   // row=row+5;	
 }
 }
}
