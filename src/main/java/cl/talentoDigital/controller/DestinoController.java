package cl.talentoDigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.talentoDigital.model.Destino;
import cl.talentoDigital.service.IDestinoService;
import cl.talentoDigital.service.IPasajeroService;

@Controller
@RequestMapping("/destino")
public class DestinoController {
	@Autowired
	IDestinoService destinoService;
	@Autowired
	IPasajeroService pasajeroService;
	
	@GetMapping("/crear")
	public String crear(Model model) {
		model.addAttribute("destino", new Destino());
		model.addAttribute("pasajeros", pasajeroService.findAll());
		return "crear-destino";
	}
	
	@PostMapping("/guardar")
	public RedirectView guardar(Model model, @ModelAttribute Destino destinoDesdeVista) {
		destinoService.save(destinoDesdeVista);
	return new RedirectView("/destino/destinos");
	}
	
	@GetMapping("/destinos")
	public String destinos(Model model) {
		model.addAttribute("listaDestinos", destinoService.findAll());
		model.addAttribute(pasajeroService.findAll());
	return "destinos";	
	}
}
