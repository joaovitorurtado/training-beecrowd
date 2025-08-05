import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    String nome = myObj.nextLine();
    double salario = myObj.nextDouble();
    double porcentual = myObj.nextDouble();
    salario = salario + (porcentual * 0.15);

    System.out.printf("TOTAL = R$ %.2f%n", salario);
  }
}