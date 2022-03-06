import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Insira seu texto: ");
            String text = obj.nextLine();
            String upper = text.toUpperCase();
        System.out.println("Seu texto em caixa alta: " + upper);

    }
}
