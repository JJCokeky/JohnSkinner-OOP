// Don't forget a header comment block
public class LoopDemo
{
   public static void main(String[] args)
   {   	
		
		// while loop
		int i = 1; // declare & initialize loop counter variable
		while(i <= 3) // loop while i is < = 3
		{
			System.out.println("while loop: i = " + i);
			i = i + 1; // increment loop counter
		}
		
		// do loop
		int j = 1;
		do 
		{
			System.out.println("do loop: j = " + j);
			j++;				// use the increment operator
		} while(j <= 3);	
		

		// pre-test & post-test compared
		j = 1;
		while(j > 3) // expression is initially false
		{	
			System.out.println("while loop executed");
		}

		do
		{
			System.out.println("do loop executed");
		}while(j > 3); // expression is initially false

		
		// for loop
		for(int k = 1; k <= 3; k++)
		{
			System.out.println("for loop: k = " + k);
		}

		// ADD ADDITIONAL FUNCTIONALITY HERE:
		
	}
}	










