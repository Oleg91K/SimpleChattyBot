import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String cuisinePreference = scanner.nextLine();
        String yearsOfExperience = scanner.nextLine();


        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef who cooks " + yearsOfExperience +
                " dishes and has " + cuisinePreference +
                " years of experience.");

    }
}