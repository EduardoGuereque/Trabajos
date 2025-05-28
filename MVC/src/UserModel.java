import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UserModel {
	
	public List<Users> getUsers() {
		
		String query = "select id, name, email, role, phone, create_at, update_at from users";
		Connection conn = null;
		Statement stmt = null;
		List<Users> users = new ArrayList<>();
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1", "root", "");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String role = rs.getString(4);
				String num = rs.getString(5);
				Date create_at = rs.getDate(6);
				Date update_at = rs.getDate(7);

				users.add(new Users(id, name, email, role, num, create_at, update_at));
			}
			rs.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return users;
	}
	
	public boolean add(String name, String email, String role)
	{
		String query = "INSERT INTO `users` (`id`, `name`, `email`, `role`, `phone`, `create_at`, `update_at`) VALUES (NULL, '"+name+"', '"+email+"', '"+role+"', NULL, NULL, NULL);";
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1", "root", "");
			stmt = conn.createStatement();
			
			int rs = stmt.executeUpdate(query);
			 
			if(rs > 0) 
				return true; 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return false;
	}
	
	public void remove(int users_id) {
		
		String query = "DELETE FROM `users` WHERE `users`.`id` = " + users_id;
		Connection conn = null;
		Statement stmt = null;
		List<Users> users = new ArrayList<>();
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1", "root", "");
			stmt = conn.createStatement();
			int rs = stmt.executeUpdate(query);
			 
			if(rs > 0) 
				return; 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
	}
}
