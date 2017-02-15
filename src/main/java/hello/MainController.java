package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bussiness.Participant;
import exceptions.BussinesException;

@RestController
public class MainController {
	
	private Participant participant;
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
    @ResponseBody
    public UserInfo user(@RequestBody Request request) throws BussinesException  {
		
		participant = new Participant();
		UserInfo ui = null;
		try{
			ui = participant.getParticipant(request.getNombre(),request.getPassword());
		}catch (BussinesException be) {
			throw be;
		}
		return ui;
	}
    
    
//    @RequestMapping("/")
//    public String landing(Model model, @RequestParam("nombre") String nombre) {
//    	model.addAttribute("nombre", "Amiga");
//        return "saludo";
//    }
//    
//    @RequestMapping("/hola")
//    public String hola(Model model) {
//    	model.addAttribute("nombre", "Luis");
//        return "saludo";
//    }

}