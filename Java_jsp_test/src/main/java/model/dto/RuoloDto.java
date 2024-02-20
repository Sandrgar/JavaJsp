package model.dto;

public class RuoloDto {

	private Long idRuolo;
	private String nomeRuolo;
	
	public RuoloDto() {}

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
