import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    /*TODO: Conhecer e importar a classe scanner

    Exibir as mensagens para o nosso usuário

    Obter pela Scanner os valores digitados no terminal

    Exibir a mensagem conta criada*/

    // variáveis informações

    String nomeCliente;
    String sobreNome;
    int idade;
    String agencia;
    String numeroConta = "";
    double saldo = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Olá! Vamos iniciar seu cadastro na plataforma de carteira digital!");

    System.out.println("\nPor favor, digite seu primeiro nome: ");
    nomeCliente = sc.nextLine();

    System.out.println("\nAgora, digite seu sobrenome: ");
    sobreNome = sc.nextLine();

    System.out.println("\nQuantos anos você tem?");
    idade = sc.nextInt();

    System.out.println("\nAgora, vamos às informações da conta de banco");

    sc.nextLine(); //corrigindo o pulo de scan

    System.out.println("Digite o número da agencia:");
    agencia = sc.nextLine();

    System.out.println("\nAgora, informe o número da conta:\n");
    numeroConta = sc.nextLine();

    System.out.println("\n || Olá, " + nomeCliente + ", obrigado por criar uma conta em nossa carteira digital. Informações: Agência " + agencia + ", conta " + numeroConta + " e seu saldo atual é " + saldo + ", já disponível para saque ||"  );
    
    }
}
