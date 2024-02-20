package model.bean;

public class AutoreBean {

	private Long idAutore;
	private String nomeAutore;
	private String cognomeAutore;
	
	public AutoreBean() {}

	public Long getIdAutore() {
		return idAutore;
	}

	public void setIdAutore(Long idAutore) {
		this.idAutore = idAutore;
	}

	public String getNomeAutore() {
		return nomeAutore;
	}

	public void setNomeAutore(String nomeAutore) {
		this.nomeAutore = nomeAutore;
	}

	public String getCognomeAutore() {
		return cognomeAutore;
	}

	public void setCognomeAutore(String cognomeAutore) {
		this.cognomeAutore = cognomeAutore;
	}

	@Override
	public String toString() {
		return "AutoreBean [idAutore=" + idAutore + ", nomeAutore=" + nomeAutore + ", cognomeAutore=" + cognomeAutore
				+ "]";
	}
	
	
	
}
