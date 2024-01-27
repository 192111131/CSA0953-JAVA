import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        int fact=1,i;
        System.out.print("enter the number:");
        n=scanner.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print("the factorial of the number:"+fact);
        scanner.close();
    }
}