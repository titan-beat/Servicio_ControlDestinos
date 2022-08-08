package cl.talentoDigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.talentoDigital.model.Pasajero;
import cl.talentoDigital.service.IDestinoService;
import cl.talentoDigital.service.IPasajeroService;

@Controller
@RequestMapping("/pasajero")
public class PasajeroController {
	@Autowired
	IDestinoService destinoService;
	@Autowired
	IPasajeroService pasajeroService;
	
	@GetMapping("/crear")
	public String crear(Model model) {
		model.addAttribute("pasajero", new Pasajero());
		model.addAttribute("listaDestinos", destinoService.findAll());
		
		return "crear-pasajero";
	}
	
	@PostMapping("/guardar")
	public RedirectView guardar(Model model, @ModelAttribute Pasajero pasajeroDesdeVista) {
		pasajeroService.save(pasajeroDesdeVista);
	return new RedirectView("/pasajero/pasajeros");
	}
	
	@GetMapping("/pasajeros")
	public String pasajeros(Model model) {
		model.addAttribute("listaPasajeros", pasajeroService.findAll());
	return "pasajeros";	
	}

}
