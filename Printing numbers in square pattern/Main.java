import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=1;
      for(int crow=1; crow<=n; crow++)
      {
        for(int ccol=1; ccol<=n; ccol++)
        {
          System.out.print(crow);
        }
        System.out.print("\n");
      }
	}
}