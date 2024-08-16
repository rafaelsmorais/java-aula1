import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.printf("Digite a primeira nota: ");
    int nota1 = input.nextInt();
    System.out.printf("Digite a segunda nota: ");
    int nota2 = input.nextInt();
    System.out.printf("Digite a terceira nota: ");
    int nota3 = input.nextInt();

    int media = (nota1 + nota2 + nota3) / 3;

    if (media >= 70) {
      System.out.println("Aprovado!");
    } else if (media < 40) {
      System.out.println("Reprovado!");
    } else {
      System.out.println("Está na Final!");
    }
    input.close();
  }
}
