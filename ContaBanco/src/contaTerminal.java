import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao banco\nDigite suas informações a seguir!");
        System.out.println("Nome: ");
            String nomeCliente = scanner.nextLine();

        System.out.println("Numero da Conta: ");
            int conta = scanner.nextInt();

        System.out.println("Numero da agência: ");
            String agencia = scanner.next();

        System.out.println("Informe deposito inicial: ");
            float saldo = scanner.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", Conta: "+conta+" e seu saldo de "+saldo+" reais já está disponível para saque");
        scanner.close();
    }
}
