package model.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.AutoreBean;
import model.bean.LibroBean;
import utils.DbConnection;

public class LibroDao {

	public List<LibroBean> autorePrezzoDec() {
		String query = "SELECT b.* FROM Libro b JOIN Autore a ON b.id_autore_fk = a.id_autore ORDER BY a.cognome, b.prezzo DESC";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<LibroBean> libriAutorePrezzo = new ArrayList<>();

		try {
			st = con.createStatement();
			

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();

				libroBean.setIdLibro(rs.getLong("id_libro"));
				libroBean.setTitoloLibro(rs.getString("titolo"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setDataPubblicazioneLibro(rs.getTimestamp("data_pubblicazione").toLocalDateTime().toLocalDate());
				libroBean.setCopieVenduteLibro(rs.getInt("copie_vendute"));
				libroBean.setBestSellerLibro(rs.getBoolean("isBestSeller"));
				libroBean.setIdAutore(rs.getLong("id_autore_fk"));
				

				libriAutorePrezzo.add(libroBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbCon.closeConnection(con);
		}

		return libriAutorePrezzo;
	}
	
	public List<LibroBean> getLibriAutori() {
		String query = "SELECT * FROM Libro l JOIN Autore a ON l.id_autore_fk = a.id_autore WHERE a.nome = 'alessandro' ORDER BY l.data_pubblicazione ASC;";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<LibroBean> libri = new ArrayList<>();

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();
				AutoreBean autoreBean = new AutoreBean();
				
				autoreBean.setNomeAutore(rs.getString("nome"));
				autoreBean.setCognomeAutore(rs.getString("cognome"));
                libroBean.setTitoloLibro(rs.getString("titolo"));
                libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
                libroBean.setDataPubblicazioneLibro(rs.getTimestamp("data_pubblicazione").toLocalDateTime().toLocalDate());
                libroBean.setCopieVenduteLibro(rs.getInt("copie_vendute"));
                libroBean.setBestSellerLibro(rs.getBoolean("isBestSeller"));
                libroBean.setIdAutore(rs.getLong("id_autore_fk"));
				
                libri.add(libroBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		for (LibroBean u : libri) {
			System.out.println(u);
		}

		return libri;
	}
}
