import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float a,b,c;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextFloat();
        b=Sc.nextFloat();
        c=(a*b);
        System.out.format("%.2f",c);
    }
}