/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.controller;

import mx.edu.utez.demo.entity.Empleado;
import mx.edu.utez.demo.model.EmpleadoModel;
import mx.edu.utez.demo.service.EmpleadoService;
import mx.edu.utez.demo.service.TiendaService;
import mx.edu.utez.demo.service.TipoEmpleadoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("empleado")
public class EmpleadoController {

    private static final Log LOG = LogFactory.getLog(EmpleadoController.class);

    @Autowired
    private EmpleadoService empleadoService;
    @Autowired
    private TipoEmpleadoService tipoEmpleadoService;
    @Autowired
    private TiendaService tiendaService;
    @GetMapping("/cancel")
	public String cancel() {
		return "redirect:/empleado/goEmpleado";
	}


    //@RequestMapping(value="goEmpleado",method=RequestMethod.GET)
    @GetMapping("goEmpleado")
    public String goEmpleado(Model model) {
        model.addAttribute("empleado", empleadoService.findAll());
        return "empleado";
    }

    @GetMapping("empleadoForm")
    public String empleadoForm(@RequestParam(name="id",required=false)Integer id,Model model) {
        EmpleadoModel empleadoModel = new EmpleadoModel();
        if (id != null) {
            empleadoModel = empleadoService.findEmpleadoByIdModel(id);
            
        }

        model.addAttribute("empleadoModel", empleadoModel);
        model.addAttribute("tipoEmpleadoList",tipoEmpleadoService.findAll());
        model.addAttribute("listaTienda",tiendaService.findAll());
        return "empleadoForm";
    }

   
    @PostMapping("/addempleado")
    public String addContact(@ModelAttribute("empleadoModel") EmpleadoModel empleadoModel, RedirectAttributes model) {
        LOG.info("METHOD: addEmpleado() --PARAM : empleadoModel=" + empleadoModel);

        if (null != empleadoService.addEmpleado(empleadoModel)) {
            model.addFlashAttribute("result", 1);
        } else {
            model.addFlashAttribute("result", 0);
        }

        return "redirect:/empleado/goEmpleado";
    }
}
