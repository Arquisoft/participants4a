package asw.ui.action.user;


import asw.business.user.UpdateEmail;
import asw.business.user.UpdatePassword;
import asw.model.Usuario;
import asw.ui.action.Action;

public class UpdateEmailAction implements Action {
	private String emailAntiguo;
	private String emailNuevo;
	private JSONObject json;
	
	public UpdateEmailAction(String emailAntiguo, String emailNuevo) {
		this.emailAntiguo = emailAntiguo;
		this.emailNuevo = emailNuevo;
		this.json = json;
	}

	@Override
	public void execute() throws Exception {
		Usuario u;
		Usuario user = new UpdateEmail(u, emailAntiguo, emailNuevo).execute();
	}

}