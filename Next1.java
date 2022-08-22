package payilgam;

public class Next1 
{
 public static void main(String args[])
 {
  int n=1234;
  int sum=0;
  for(int i=1;n>0;n=n/10)
  {
	sum=sum+n%10;
//	n=n/10;
  }
  System.out.println(sum);
 }
}
