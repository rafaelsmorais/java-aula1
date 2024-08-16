import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.printf("Qual o salário bruto? ");
    double salarioBruto = input.nextDouble();
    double salarioLiquido;

    if (salarioBruto <= 900.0) {
      salarioLiquido = salarioBruto;
      System.out.printf("Isento\nSalário Líquido: %.2f\n", salarioLiquido);
    } else if (salarioBruto > 900 && salarioBruto <= 1500) {
      salarioLiquido = salarioBruto * 0.95;
      System.out.printf("Desconto de 5%%\nSalário Líquido: %.2f\n", salarioLiquido);
    } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
      salarioLiquido = salarioBruto * 0.90;
      System.out.printf("Desconto de 10%%\nSalário Líquido: %.2f\n", salarioLiquido);
    } else {
      salarioLiquido = salarioBruto * 0.80;
      System.out.printf("Desconto de 20%%\nSalário Líquido: %.2f\n", salarioLiquido);
    }
    input.close();
  }
}
