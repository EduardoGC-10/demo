
package mx.edu.utez.demo.controller;

import mx.edu.utez.demo.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tienda")
public class TiendaController {
    @Autowired
    private TiendaService tiendaService;
    
    @GetMapping("goTienda")
    public String goEmpleado(Model model) {
        model.addAttribute("tienda", tiendaService.findAll());
        return "tienda";
    }
    
}
