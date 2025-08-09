import java.util.Scanner;
class Program_2 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1; 
            System.out.print(oddNumber);
            if (i < a) { 
                System.out.print(", ");
            }
        }
    }
}