package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

import model.bean.UtenteBean;
import utils.DbConnection;

public class UtenteDao {

	public List<UtenteBean> findAll() {
		String query = "SELECT * FROM utente;";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<UtenteBean> utenti = new ArrayList<>();

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				UtenteBean utenteBean = new UtenteBean();

				utenteBean.setIdUtente(rs.getLong("id_utente"));
				utenteBean.setNomeUtente(rs.getString("nome"));
				utenteBean.setCognomeUtente(rs.getString("cognome"));
				utenteBean.setEmailUtente(rs.getString("email"));
				utenteBean.setPasswordUtente(rs.getString("password"));
				utenteBean.setCompleannoUtente(rs.getTimestamp("compleanno").toLocalDateTime().toLocalDate());
				utenteBean.setYoungUtente(rs.getBoolean("isYoung"));

				utenti.add(utenteBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		for (UtenteBean u : utenti) {
			System.out.println(u);
		}

		return utenti;
	}

	public UtenteBean getUtente(Long id) {
		String query = "SELECT * FROM utente WHERE id_utente=?";
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
		UtenteBean utenteBean = new UtenteBean();
		try {
			rs = ps.executeQuery();

			while (rs.next()) {
				utenteBean.setIdUtente(rs.getLong("id_utente"));
				utenteBean.setNomeUtente(rs.getString("nome"));
				utenteBean.setCognomeUtente(rs.getString("cognome"));
				utenteBean.setEmailUtente(rs.getString("email"));
				utenteBean.setPasswordUtente(rs.getString("pass"));
				utenteBean.setCompleannoUtente(rs.getTimestamp("compleanno").toLocalDateTime().toLocalDate());
				utenteBean.setYoungUtente(rs.getBoolean("isYoung"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		System.out.println(utenteBean);
		return utenteBean;
	}

	public int update(UtenteBean utenteBean) {
		String query = "UPDATE utente SET nome=?, cognome=?, email=?, password=?, isYoung=? WHERE id_utente=?";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);

			ps.setString(1, utenteBean.getNomeUtente());
			ps.setString(2, utenteBean.getCognomeUtente());
			ps.setString(3, utenteBean.getEmailUtente());
			ps.setString(4, utenteBean.getPasswordUtente());
			ps.setBoolean(6, utenteBean.isYoungUtente());
			ps.setLong(7, utenteBean.getIdUtente());

		} catch (SQLException e) {
			e.printStackTrace();
		}

		int updateOutput = 0;
		try {
			updateOutput = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);

		return updateOutput;
	}

	public List<UtenteBean> getDueUtentiGiovani() {
		String query = "SELECT * FROM Utente ORDER BY compleanno DESC LIMIT 2";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<UtenteBean> utenti = new ArrayList<>();
		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				UtenteBean utenteBean = new UtenteBean();

				utenteBean.setIdUtente(rs.getLong("id_utente"));
				utenteBean.setNomeUtente(rs.getString("nome"));
				utenteBean.setCognomeUtente(rs.getString("cognome"));
				utenteBean.setEmailUtente(rs.getString("email"));
				utenteBean.setPasswordUtente(rs.getString("password"));
		
				utenti.add(utenteBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		for (UtenteBean u : utenti) {
			System.out.println(u);
		}

		return utenti;
	}

}
