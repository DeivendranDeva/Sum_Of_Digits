package payilgam;

public class Pri_me
{
  public static void main(String arg[])
  {
	Pri_me ok=new Pri_me();
	ok.save(23);
  }
  void save(int a)
      {
	   int count=0;
	   int i=1;
	   while(i<=a)
	     {
		 if(a%i==0){
			         System.out.println("The factorial number is: "+i );
			         count++;
		            }
		  i++;
	     }
         System.out.println("Total count: "+count);
	     if(count==2){
	    	          System.out.println("It is a prime number");
                     }
	     else {
	    	    System.out.println("It is not a prime number");
	          }
	     
     }
}