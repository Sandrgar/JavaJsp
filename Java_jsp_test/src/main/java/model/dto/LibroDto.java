package model.dto;

import java.time.LocalDate;

public class LibroDto {

	private Long idLibro;
	private String titoloLibro;
	private String autoreLibro;
	private double prezzoLibro;
	private LocalDate dataPubblicazioneLibro;
	private int copieVenduteLibro;
	private boolean isBestSellerLibro;
	
	
	public LibroDto() {}


	public Long getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}


	public String getTitoloLibro() {
		return titoloLibro;
	}


	public void setTitoloLibro(String titoloLibro) {
		this.titoloLibro = titoloLibro;
	}


	public double getPrezzoLibro() {
		return prezzoLibro;
	}


	public void setPrezzoLibro(double prezzoLibro) {
		this.prezzoLibro = prezzoLibro;
	}


	public String getAutoreLibro() {
		return autoreLibro;
	}


	public void setAutoreLibro(String autoreLibro) {
		this.autoreLibro = autoreLibro;
	}


	public LocalDate getDataPubblicazioneLibro() {
		return dataPubblicazioneLibro;
	}


	public void setDataPubblicazioneLibro(LocalDate dataPubblicazioneLibro) {
		this.dataPubblicazioneLibro = dataPubblicazioneLibro;
	}


	public int getCopieVenduteLibro() {
		return copieVenduteLibro;
	}


	public void setCopieVenduteLibro(int copieVenduteLibro) {
		this.copieVenduteLibro = copieVenduteLibro;
	}


	public boolean isBestSellerLibro() {
		return isBestSellerLibro;
	}


	public void setBestSellerLibro(boolean isBestSellerLibro) {
		this.isBestSellerLibro = isBestSellerLibro;
	}


	@Override
	public String toString() {
		return "LibroBean [idLibro=" + idLibro + ", titoloLibro=" + titoloLibro + ", prezzoLibro=" + prezzoLibro
				+ ", dataPubblicazioneLibro=" + dataPubblicazioneLibro + ", copieVenduteLibro=" + copieVenduteLibro
				+ ", isBestSellerLibro=" + isBestSellerLibro + "]";
	}
	
	
	
	
}
