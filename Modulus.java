import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,d;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        d=a%b;
        System.out.println(d);
    }
}
