package mx.edu.utez.demo.controller;

import mx.edu.utez.demo.service.TipoEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tipoEmpleado")
public class TipoEmpleadoController {

    @Autowired
    private TipoEmpleadoService tipoEmpleadoService;

    @GetMapping("goTipoEmpleado")
    public String goTipoEmpleado(Model model) {
        model.addAttribute("tipoEmpleado", tipoEmpleadoService.findAll());
        return "tipoEmpleado";
    }

}
