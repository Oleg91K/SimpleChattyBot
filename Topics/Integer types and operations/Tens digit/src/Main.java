import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        number1 = scanner.nextInt();
        number2 = number1 % 100 / 10;
        System.out.println(number2);
    }
}