import java.util.Scanner;
class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        int lastOdd = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= lastOdd; i += 2) {
            System.out.print(i);
            if (i < lastOdd) {
                System.out.print(", ");
            }
        }
    }
}
