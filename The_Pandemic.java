import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,handshakes;
        n=sc.nextInt();
        if (n<3)
          System.out.println(n-1);
        else
           System.out.println(2);
     
    }
}