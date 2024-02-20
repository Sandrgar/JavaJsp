package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.AutoreBean;
import model.bean.LibroBean;
import service.AutoreService;
import service.LibroService;

@WebServlet("/QueryFour")

public class QueryFour extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LibroService libroService = new LibroService();
        AutoreService autoreService = new AutoreService();
        
		List<LibroBean> libroBestSeller = libroService.QueryFour();
		List<AutoreBean> autori = new ArrayList<>();
		
		for (LibroBean ut : libroBestSeller) {
			AutoreBean autore = autoreService.getAutore(ut.getIdAutore());
			System.out.println(ut);
			
			autori.add(autore);
		}
		


				
		request.setAttribute("result", libroBestSeller);
		request.setAttribute("autori", autori);
   
		RequestDispatcher rd = request.getRequestDispatcher("/QueryFour.jsp");
		rd.forward(request, response);
	}
}