import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {

    	Locale.setDefault(Locale.US);
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);  

        int numero;
        String agencia, nome, sobrenome;
        double saldo;

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.next();
        System.out.print("Por favor, digite seu primeiro e último nome: ");
        nome = sc.next();
        sobrenome = sc.next();
        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = sc.nextDouble();

        //TODO: Exibir a mensagem da conta criada
        System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.%n",
                          nome, sobrenome, agencia, numero, saldo);

        sc.close(); 
    }
}
