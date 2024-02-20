package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.AutoreBean;
import model.bean.UtenteBean;
import utils.DbConnection;

public class AutoreDao {

	
	public AutoreBean getAutore(Long id) {
		String query = "SELECT * FROM autore WHERE id_autore =?";
        DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ResultSet rs;
		AutoreBean autoreBean = new AutoreBean();
		try {
			rs = ps.executeQuery();

			while (rs.next()) {
				autoreBean.setIdAutore(rs.getLong("id_autore"));
				autoreBean.setNomeAutore(rs.getString("nome"));
				autoreBean.setCognomeAutore(rs.getString("cognome"));
			
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
       
		dbCon.closeConnection(con);
		System.out.println(autoreBean);
		return autoreBean;
	}
	
	public List<AutoreBean> getAllAutori() {
		String query = "SELECT * FROM autore;";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<AutoreBean> autori = new ArrayList<>();

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				AutoreBean autoreBean = new AutoreBean();

				autoreBean.setIdAutore(rs.getLong("id_autore"));
				autoreBean.setNomeAutore(rs.getString("nome"));
				autoreBean.setCognomeAutore(rs.getString("cognome"));
		

			

				autori.add(autoreBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		for (AutoreBean u : autori) {
			System.out.println(u);
		}

		return autori;
	}
	

	
	
}
