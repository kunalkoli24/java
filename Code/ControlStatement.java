import java.util.Scanner;
public class ControlStatement{

	public static void main(String args[]){
		int a,b,sum=0;			
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers:");

		a = sc.nextInt();

		b = sc.nextInt();
		
		int c=0, d=0;
	
		if(a>0 && b>0){
			if(a*b>100){
				if(a+b<35){				
					System.out.println("\nUsing Nested if: a*b is greater than 100 ,but a+b is smaller than 35.");	
				}			
				else if(a+b==35){
				System.out.println("\nUsing Nested if: a*b is greater than 100 and a+b is equal to 35.");
				}
				else{
				System.out.println("\nUsing Nested if: a*b is greater than 100 and a+b is greater than 35.");
				}
			}
		}
		else{
			System.out.println("Either of a & b is less than 0. ");
}

		for(int j=0;j<=a;j++){
			sum=sum+b;
		}
		System.out.println("\nFor Loop: here it prints multiplication of a & b :"+sum);

		System.out.println("\nDo-While Loop:Print all even numbers till " +a);
		do{
			System.out.println(c);
			c=c+2;
		}while(c<=a);

	}	
}
