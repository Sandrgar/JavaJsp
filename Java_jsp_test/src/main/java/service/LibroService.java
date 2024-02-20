package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.bean.LibroBean;
import model.dao.LibroDao;

public class LibroService {
	
	public List<LibroBean> QueryThree() {
        LibroDao libroDao = new LibroDao();
		List<LibroBean> libri = new ArrayList<>();
	
		libri = libroDao.autorePrezzoDec();
		
		return libri;
	}
	
	public List<LibroBean> QueryFour() {
	    LibroDao libroDao = new LibroDao();
	    List<LibroBean> libriAutore = libroDao.getLibriAutori();

	    for (LibroBean libro : libriAutore) {
	        if (libro.getCopieVenduteLibro() >= 3) {
	            libro.setBestSellerLibro(true);
	        }
	        if (libro.isBestSellerLibro() && libro.getDataPubblicazioneLibro().isBefore(LocalDate.now().minusYears(10))) {
	            double nuovoPrezzo = libro.getPrezzoLibro() * 0.8;
	            libro.setPrezzoLibro(nuovoPrezzo);
	        }
	    }
	    
	    return libriAutore;
	}
}
