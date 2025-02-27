import java.util.regex.Pattern;
public class practice 
{
 public static void main(String args[])
    {    
        try 
        {
            float answer=0.0f;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter te number you wish to divide. ");

            float num1 = scanner.nextFloat();

            System.out.print("Enter the divisor. ");

            float num2 = scanner.nextFloat();
            if(num2==0)
                System.out.print("You cannot divide by zero. ");
            else 
                answer=divideTwoNumber(num1,num2);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public float divideTwoNumber(float dividend, float divisor)
{
    if(divisor==0)
     throw new IllegalArgumentException("Divisor Cannot be Zero");

     return dividend/divisor;
}


		// your code goes here
		
		for ( int i = i; i <= 5; i++ ) {
		    int square = i * i;
		    System.out.println("square");
		}
		
		for ( int i = i; i <= 5 ; i++){
		    int square = i * i;
		    System.out.println("square");
		}
		
		for (int i = i ; i <= 5 ; i++){
		    int square = i*i;
		    System.out.println("square");
		}
        
        // 4
         for (int i = i ;i <= 5 ; i++){
             int square = i * i;
             System.out.println("square");
         }
         // 5 
         for ( int i = i ;i <= 5 ;i++){
             int square = i * i;
             System.out.println("square");
         }
         // 6 
         for(int i = i ; i <= 5 ; i++ ){
             int square = i * i;
             System.out.println("square");
         }
         // 7 
         for(int i=i;i<=5; i++){
             int square = i *i;
             System.out.println("square");
         }
         // 8 
         for( int i = i ; i <=5 ; i++){
             int square = i * i;
             System.out.println("Square");
         }
         // 9 
         for(int i =i; i <=5; i++){
             int square = i*i;
             System.out.println("Square");
         }
         
        // 10 
        for(int i = i ; i <=5 ; i++){
            int square = i*i;
            System.out.println("Square");
        }
	} 
}
