package model.dto;

import java.time.LocalDate;

public class UtenteDto {

	private Long idUtente;
	private String nomeUtente;
	private String cognomeUtente;
	private String emailUtente;
	private String passwordUtente;
	private LocalDate compleannoUtente;
	private boolean isYoungUtente;
	
	public UtenteDto() {}

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getCognomeUtente() {
		return cognomeUtente;
	}

	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}

	public String getEmailUtente() {
		return emailUtente;
	}

	public void setEmailUtente(String emailUtente) {
		this.emailUtente = emailUtente;
	}

	public String getPasswordUtente() {
		return passwordUtente;
	}

	public void setPasswordUtente(String passwordUtente) {
		this.passwordUtente = passwordUtente;
	}

	public LocalDate getCompleannoUtente() {
		return compleannoUtente;
	}

	public void setCompleannoUtente(LocalDate compleannoUtente) {
		this.compleannoUtente = compleannoUtente;
	}

	public boolean isYoungUtente() {
		return isYoungUtente;
	}

	public void setYoungUtente(boolean isYoungUtente) {
		this.isYoungUtente = isYoungUtente;
	}

	@Override
	public String toString() {
		return "UtenteBean [idUtente=" + idUtente + ", nomeUtente=" + nomeUtente + ", cognomeUtente=" + cognomeUtente
				+ ", emailUtente=" + emailUtente + ", passwordUtente=" + passwordUtente + ", compleannoUtente="
				+ compleannoUtente + ", isYoungUtente=" + isYoungUtente + "]";
	}
	
	
}