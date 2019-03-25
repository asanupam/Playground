import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int crow=1; crow<=n; crow++)
      {
        for(int ccol=1; ccol<=crow; ccol++)
        {
          System.out.print(crow);
        }
        System.out.print("\n");
      }
	}
}