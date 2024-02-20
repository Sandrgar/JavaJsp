package service;




import model.bean.AutoreBean;
import model.dao.AutoreDao;

public class AutoreService {

	AutoreDao autoreDao = new AutoreDao();
	
	public AutoreBean getAutore(Long id){
		AutoreBean autore = autoreDao.getAutore(id);
		
		return autore;
	}
	
}
