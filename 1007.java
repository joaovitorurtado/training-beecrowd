import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int A = myObj.nextInt();
        int B = myObj.nextInt();
        int C = myObj.nextInt();
        int D = myObj.nextInt();
        A = (A * B - C * D);

        System.out.println("DIFERENCA = " + A);
    }
}

