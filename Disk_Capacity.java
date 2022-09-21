import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c,d,capacity;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        d=2*(a*b*c);
        capacity=d*512;
        System.out.println(capacity);
    }
}