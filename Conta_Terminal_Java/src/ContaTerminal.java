
public class ContaTerminal {
	//atributos
	private int numero;
	private String agencia;
	private String nomeCliente;
	private float saldo;
	//construtores
	public ContaTerminal() {
        this.numero = 0; 
        this.agencia = "0000"; 
        this.nomeCliente = "Cliente Padrão"; 
        this.saldo = 0;
	} 
	 public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo) {
	        this.numero = numero;
	        this.agencia = agencia;
	        this.nomeCliente = nomeCliente;
	        this.saldo = saldo;
	    }
	//getters
	public int getNumero() {
		return numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public float getSaldo() {
		return saldo;
	}
	//setters
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
