package application.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import application.domain.Request;
import application.domain.User;
import application.exception.BusinessException;
import application.service.Participant;

@Controller
public class MainController {

	private Participant participant;

	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseBody
	public User user(Request request) throws BusinessException {

		this.participant = new Participant();
		User ui = null;
		try {
			ui = this.participant.getParticipant(request.getEmail(), request.getPassword());
		} catch (BusinessException be) {
			throw be;
		}
		return ui;
	}

	@RequestMapping("/")
	public String landing(Model model) {
		model.addAttribute("infoLogin", new Request());
		return "WelcomePage";
	}

}