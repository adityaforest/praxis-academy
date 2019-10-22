import java.util.Scanner;

public class ExponentCalculator
{
 	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Exponent calculator");
System.out.println("===================");
System.out.println("Enter the base: ");
int a = Integer.parseInt(scanner.nextLine());
System.out.println("Enter the exponent: ");
int n = Integer.parseInt(scanner.nextLine());

int result = a;
for (int i = 0; i < (n - 1); i++)
{
        result = result * a;
}

System.out.println("Result: " + result);
System.out.println("Thank you for using our exponent calculator");
	}
}
