package cl.talentoDigital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller

public class IniController {
	
	@RequestMapping({"/",""})
	public RedirectView ini() {	
	 return new RedirectView("/destino/destinos");
	}
	
}
