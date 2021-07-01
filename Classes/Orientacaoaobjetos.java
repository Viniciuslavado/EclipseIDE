	package PacoteJava2;


public class Orientacaoaobjetos {

	private String nomePaciente;
	private int documento;
	private int numerodacarterinha;
	
	public Orientacaoaobjetos(String nomePaciente,int documento,int numerodaCarterinha) {
		
	this.nomePaciente = nomePaciente;
	this.documento = documento;
	this.numerodacarterinha = numerodaCarterinha;
	
	}
	
	public void imprimirDados() {
		System.out.println("\nNome do Paciente: " +nomePaciente);
		System.out.println("\nNumero do Documento: " +documento);
		System.out.println("\nNumero da Carterinha: " +numerodacarterinha);
		
	}
	public String getNome() {
		return nomePaciente; 
		
	{
		public void setNomePaciente (String nomePaciente) {
			this.nomePaciente = nomePaciente;
	}
		public int getDocumento () {
			return documento;
	}
	
		public void setDocumento (int documento) {
			this.documento = documento;
			
	}
		public int getnumerodacarterinha() {
			return numerodacarterinha;
			
	}
		public void setNumerodacarterinha (int numerodacarterinha) {
			this.numerodacarterinha = numerodacarterinha;
	}

	
}