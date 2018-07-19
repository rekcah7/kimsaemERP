package emp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import emp.dto.EmpDTO;
import emp.dto.LoginDTO;

public interface EmpDAO {
	int insert(EmpDTO user, Connection con) throws SQLException;
	ArrayList<EmpDTO> getMemberList(Connection con) throws SQLException;
	int delete(String id, Connection con) throws SQLException;
	EmpDTO read(String id, Connection con) throws SQLException;
	ArrayList<EmpDTO> search(String column, String search, String pass, Connection con) throws SQLException;
	int update(EmpDTO user, Connection con) throws SQLException;
	LoginDTO login(String id, String pass,Connection con) throws SQLException;
	
}
