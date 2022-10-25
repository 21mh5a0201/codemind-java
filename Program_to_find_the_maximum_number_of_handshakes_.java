import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,handshakes;
        n=sc.nextInt();
        handshakes=(n-1)*n/2;
        System.out.println(handshakes);
     
    }
}