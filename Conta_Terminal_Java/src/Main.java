import java.util.Scanner;

public class Main {
    private ContaTerminal conta;

    public Main() {
        this.conta = new ContaTerminal();
    }

    public void menu() {
        System.out.println("Bem-vindo ao banco!!");
        System.out.println("Hora de criar sua conta");
    }

    public void preencherDadosConta() {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Por favor, insira o número da Agência:");
        String agency = meuScanner.nextLine();
        preencherNumeroDaAgencia(agency);

        System.out.println("Por favor, insira o nome do cliente:");
        String client = meuScanner.nextLine();
        preencherNomeDoCliente(client);

        System.out.println("Por favor, insira o número da conta:");
        int number = meuScanner.nextInt();
        preencherNumero(number);

        System.out.println("Por favor, insira o saldo inicial:");
        float balance = meuScanner.nextFloat();
        preencherSaldo(balance);
    }

    public void preencherNomeDoCliente(String name) {
        conta.setNomeCliente(name);  
    }

    public void preencherNumeroDaAgencia(String numberA) {
        conta.setAgencia(numberA);  
    }

    public void preencherNumero(int number) {
        conta.setNumero(number);  
    }

    public void preencherSaldo(float b) {
        conta.setSaldo(b);  
    }

    public void exibirDados() {
        System.out.println("Conta criada com sucesso!");
        System.out.println("Cliente: " + conta.getNomeCliente());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }

    public static void main(String[] args) {
        Main banco = new Main();
        banco.menu();
        banco.preencherDadosConta();
        banco.exibirDados();  
    }
}
