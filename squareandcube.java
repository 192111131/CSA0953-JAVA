import java.util.Scanner;
public class SquaresAndcudes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float n,square,cube;
        System.out.print("enter the number:");
        n=scanner.nextFloat();
        square=n*n;
        cube=n*n*n;
        System.out.println("the squares of the number:"+square);
        System.out.println("the cubes of the number:"+cube);
        scanner.close();
    }
}