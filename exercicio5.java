import java.util.Scanner;

class main {
    public  static void main(String[] args) {
        Scanner IMC = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
            double  peso = IMC.nextDouble();
        System.out.println("Digite sua altura: ");
            double altura = IMC.nextDouble();
        double imc;
            imc = peso / Math.pow(altura , 2);
        System.out.println("Seu IMC é:" + imc);
    }
}
