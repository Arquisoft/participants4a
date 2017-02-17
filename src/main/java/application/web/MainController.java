package application.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.domain.User;
import application.exception.BusinessException;
import hello.Request;
import services.Participant;

@RestController
public class MainController {

	private Participant participant;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public User user(@RequestBody Request request) throws BusinessException {

		participant = new Participant();
		User ui = null;
		try {
			ui = participant.getParticipant(request.getEmail(), request.getPassword());
		} catch (BusinessException be) {
			throw be;
		}
		return ui;
	}

	// @RequestMapping("/")
	// public String landing(Model model, @RequestParam("nombre") String nombre)
	// {
	// model.addAttribute("nombre", "Amiga");
	// return "saludo";
	// }
	//
	// @RequestMapping("/hola")
	// public String hola(Model model) {
	// model.addAttribute("nombre", "Luis");
	// return "saludo";
	// }

}