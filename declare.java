import java.util.Scanner;

class declare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        System.out.println("Enter elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        System.out.println(numbers[0]);

        sc.close();
    }
}