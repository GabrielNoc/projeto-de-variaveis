import java.util.Scanner;

public class atividade {
    public static void main(String[] args){

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String CPF = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso:");
        String peso = scanner.nextLine();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu estado civil:");
        String civil = scanner.nextLine();

        scanner.close();

        System.out.println("Seu nome é" + nome + ", seu CPF é" + CPF + ", sua idade é" + idade +
", seu peso é" + peso + "você tem" + altura + "de altura", "e é " + civil + ".");
    }
}
