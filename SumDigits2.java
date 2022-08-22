package payilgam;

public class SumDigits2 
{
 public static void main(String arg[])
 {
	SumDigits2 dev=new SumDigits2();
	           dev.help(345);
 }
 void help(int n)
 {
   int sum=0;
   while(n>0 || sum>9) 
   {
	if(n==0){
		      n=sum;
		      sum=0;
	        }
	sum=sum+n%10;
	n=n/10;
   }
   System.out.println(sum);
 }
}
