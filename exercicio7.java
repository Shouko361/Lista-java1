import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Insira seu nome completo: ");
            String name = obj.nextLine();
        String[] array = name.split(" ");

        String resultado = String.valueOf(array[0]);  

        if(array.length > 1)
        resultado += array[array.length - 1];

        System.out.println("resultado: "+ resultado);
    }
}
