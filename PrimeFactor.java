package payilgam;

public class PrimeFactor
{
  public static void main(String arg[])
  {
	PrimeFactor ok=new PrimeFactor();
	ok.save(54);
  }

 public void save(int a)
      {
	   int count=0;
	   int i=2;
	   boolean flag=false;
	   while(i<a/2)
	     {
		  if(a%i==0){
			         System.out.println("The factorial number is: "+i );
			         count++;
		            }
	     if(count>0){
	    	          flag=true;
	    	         // break;
                    }
	     i++;
	     }
	     System.out.println("Total count:" +count);
	     if(flag==true) {
	    	             System.out.println("It is not a prime number");
	                    }
	     else {
	    	    System.out.println("It is a prime number");
	          }
	     
      }
}