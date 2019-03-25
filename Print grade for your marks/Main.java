import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      switch(n)  {
        case 89:
        System.out.println("A");
        break;
        case 75:
        System.out.println("B");
        break;
        case 65:
        System.out.println("C");
        break;
        case 55:
        System.out.println("D");
        break;
        case 45:
        System.out.println("E");
        break;
        default:
        System.out.println("Fail");
        break;
      }
    }
}