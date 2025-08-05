import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int number = myObj.nextInt();
        int hours = myObj.nextInt();
        double salary = myObj.nextDouble();
        double result = salary * hours;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", result);
    }
}

