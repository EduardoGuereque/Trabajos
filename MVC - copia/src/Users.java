import java.util.Date;

public class Users {
	
	public int id;
	public String name;
	public String email;
	public String role;
	public String num;
	public Date create_at;
	public Date update_at;
	
	public Users(int id, String name, String email, String role, String num, Date create_at, Date update_at) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.num = num;
		this.create_at = create_at;
		this.update_at = update_at;
	}

}
