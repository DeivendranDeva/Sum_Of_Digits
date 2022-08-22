package payilgam;   //sum of the digits synchronize to 1 digit number

public class Sum_digits 
{
 public static void main(String arg[])
 {
  Sum_digits ok=new Sum_digits();
             ok.optimize(123);
 }
 void optimize(int num) 
    {
	 int sum=0;
	 while(num>0) {
		 
	  while(num>0){
		           sum=sum+num%10;  //sum= 5
		           num=num/10;      //num= 47
		           }
	              if(sum>9) {	            	        
	            	  num = sum;
	            	  sum=0;
	                         }
	             	}
	 System.out.println(sum);
    }
}