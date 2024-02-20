package model.bean;

public class RuoloBean {

	private Long idRuolo;
	private String nomeRuolo;
	
	public RuoloBean() {}

	public Long getIdRuolo() {
		return idRuolo;
	}

	public void setIdRuolo(Long idRuolo) {
		this.idRuolo = idRuolo;
	}

	public String getNomeRuolo() {
		return nomeRuolo;
	}

	public void setNomeRuolo(String nomeRuolo) {
		this.nomeRuolo = nomeRuolo;
	}

	@Override
	public String toString() {
		return "RuoloBean [idRuolo=" + idRuolo + ", nomeRuolo=" + nomeRuolo + "]";
	}
	
	
}
