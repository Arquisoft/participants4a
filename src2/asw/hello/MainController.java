package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@RequestMapping(value="/validarse", method = RequestMethod.POST)
    @ResponseBody
    public void login(@RequestBody String email, @RequestBody String password) {
		Usuario user = new FindUser(email, password).execute();
	}
	
	@RequestMapping(value="/actualizarEmail", method = RequestMethod.POST)
    @ResponseBody
    public void actualizarEmail(@RequestBody Usuario u, @RequestBody String emailAntiguo, @RequestBody String emailNuevo) {
		Usuario user = new UpdateEmail(u, emailAntiguo, emailNuevo).execute();
	}
	
	@RequestMapping(value="/actualizarPassword", method = RequestMethod.POST)
    @ResponseBody
    public void actualizarContraseña(@RequestBody Usuario u, @RequestBody String passAntigua, @RequestBody String passNueva) {
		Usuario user = new UpdatePassword(u, passAntigua, passNueva).execute();
	}
    

}