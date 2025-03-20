
public class Pessoa {
	
	private Integer codigo;
	private String nome;
	
		
	public Pessoa() {
		
	}
	
	public Pessoa(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
