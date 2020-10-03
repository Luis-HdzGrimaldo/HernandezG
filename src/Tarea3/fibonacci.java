package Tarea3;

public class fibonacci {
	public static void main(String[] args){
		
		int num1 = 0;
	    int num2 = 1;

	    do
	    {
	        System.out.println(num1);
	        num2 = num1 + num2;
	        
	        if (num2 < 18100187)
	        {
	            System.out.println(num2);
	        }
	        
	        num1 = num1 + num2;
	    } while (num1 < 18100187);
	}
}
