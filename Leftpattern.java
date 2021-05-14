import java.util.Scanner;
class Leftpattern{
public static void main(String []a){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number of row");
int row = sc.nextInt();

for(int i =1 ; i<= row; i++){
 for (int j =1; j<= i; j++){
	 if (i<=j)
 System.out.print(" "+i);
else
	System.out.print("  ");

 }
 System.out.println();
 }
}
}