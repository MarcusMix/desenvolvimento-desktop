package resolucao;

public class Livro {
	private String titulo;
	private String categoria;
	private String autor;
	private String ano;
	private String paginas;
	private String resenha;
	
	public Livro(String titulo, String categoria, String autor, String ano,String paginas, String resenha) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.autor = autor;
		this.ano = ano;
		this.paginas = paginas;
		this.resenha = resenha;
	}

	public Livro() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public String getResenha() {
		return resenha;
	}

	public void setResenha(String resenha) {
		this.resenha = resenha;
	}
	
}
