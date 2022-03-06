import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("1º Numero:");
      int number1 = myObj.nextInt();
      System.out.println("2º Numero:");
        int number2 = myObj.nextInt();
        System.out.println("3º Numero:");
          int number3 = myObj.nextInt();

    int soma = number1 + number2 + number3;
    String texto = "Resultado: ";

    System.out.println(texto+soma);
  }
}
