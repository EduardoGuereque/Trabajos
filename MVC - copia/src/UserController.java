import java.util.List;

public class UserController {

	private UserModel model;
	private UserView view;

	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	}

	public void mostrarUsuarios() {
		List<Users> lista = model.getUsers();
		view.mostrarUsuarios(lista);
		view.setVisible(true);
	}
}
