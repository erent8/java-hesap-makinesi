import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        int n1, n2, select;


        Scanner i1 =new Scanner(System.in);
        System.out.println("Enter First Number");
        n1 = i1.nextInt();

        Scanner i2 = new Scanner(System.in);
        System.out.println("Enter Second Number");
        n2 = i2.nextInt();

        Scanner i3 = new Scanner(System.in);
        System.out.println("1-Addition\n2-Subtraction Process\n3-Multiplication\n4-Division");
        System.out.println("Your Choice : ");
        select = i3.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition Result : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction Process Result : " + (n1 - n2));
                break;

            case 3:
                System.out.println("Multiplication Result : " + (n1 * n2));
                break;

            case 4:
                System.out.println("Division Result : " + (n1 / n2));
                break;
            default:


                System.out.println("You Made the Wrong Choice");
        }





    }
}
