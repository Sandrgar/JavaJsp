package model.bean;

import java.time.LocalDate;

public class LibroBean {

	private Long idLibro;
	private String titoloLibro;
	private String autoreLibro;
	private double prezzoLibro;
	private LocalDate dataPubblicazioneLibro;
	private int copieVenduteLibro;
	private boolean isBestSellerLibro;
	private Long idAutore;
	
	
	public LibroBean() {}


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


	public Long getIdAutore() {
		return idAutore;
	}


	public void setIdAutore(Long idAutore) {
		this.idAutore = idAutore;
	}


	public String getAutoreLibro() {
		return autoreLibro;
	}


	public void setAutoreLibro(String autoreLibro) {
		this.autoreLibro = autoreLibro;
	}


	public void setPrezzoLibro(double prezzoLibro) {
		this.prezzoLibro = prezzoLibro;
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
