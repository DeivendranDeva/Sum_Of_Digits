package payilgam;

public class Next2
{
 public static void main(String args[])
 {
  int n=121;
  int count=0;
  for(int i=1;i<=n;i++)
    {
	 if(n%i==0)
	   {
	    System.out.println(i);
	    count++;
	   }
    }
  if(count>2)
	   {
		System.out.println("It is not a prime number"); 
	   }
    
 }
}
