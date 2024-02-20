package service;

import java.util.List;

import model.bean.UtenteBean;

import model.dao.UtenteDao;

public class UtenteService {

	UtenteDao utenteDao = new UtenteDao();

	public List<UtenteBean> primaQuery() {
		List<UtenteBean> utenti = utenteDao.getDueUtentiGiovani();
		String startWithConsonantRegex= "(?i)[^aeiou].*";
		
		for(UtenteBean utente: utenti) {
			if(utente.getNomeUtente().matches(startWithConsonantRegex)) {
				utente.setYoungUtente(true);
			}
		}
		
		return utenti;
	}

}
