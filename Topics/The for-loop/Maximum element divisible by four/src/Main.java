import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int numbers =  13;
        for (int i = 0; i < numbers; i++) {
            while (scanner.hasNextInt()){
                int a = scanner.nextInt();
                if (a % 4 == 0 && a > max) {
                    max = a;
                }
            }
        }
        System.out.println(max);
    }
}

