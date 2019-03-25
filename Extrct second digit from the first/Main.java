import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while (n>=10)
    {
      if (n>100)
      n= n/10;
      else
      n=n%10;
    }
    System.out.println(n);
  }
}