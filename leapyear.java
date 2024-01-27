import java.util.Scanner;
public class learYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year,date,month;
        System.out.print("enter the year:");
        year=scanner.nextInt();
        System.out.print("enter the month:");
        month=scanner.nextInt();
        System.out.print("enter the date:");
        date=scanner.nextInt();
        if(year%4==0)
        {
            System.out.print("this is the leap year");
        }
        else
        {
            System.out.print("this not a leap year");
        }
        System.out.close();
    }
}