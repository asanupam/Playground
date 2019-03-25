import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
      int count=1;
      for(int crow=1; crow<=n; crow++)
      {
        for(int ccol=1; ccol<=crow; ccol++)
        {
          if(count%2==0)
            System.out.print("#");
          else
            System.out.print("*");
          count++;
        }
        System.out.print("\n");
      }
    }
    }
