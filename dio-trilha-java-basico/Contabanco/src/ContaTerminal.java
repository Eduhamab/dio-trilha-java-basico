import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.print("Por favor Digite o numero da sua Agencia com o digito: ");
        String numberAgency = sc.next();

        System.out.print("Por favor Digite o numero da sua conta: ");
        int numberAccount = sc.nextInt();

        System.out.print("Digite o valor que deseja depositar: ");
        double deposit = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é: %s, conta: %d e seu saldo é de: %.2f, já esta disponível para saque.  ",name, numberAgency,numberAccount,deposit);




    }
}
