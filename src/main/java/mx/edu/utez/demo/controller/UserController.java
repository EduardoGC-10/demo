/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.controller;

import mx.edu.utez.demo.entity.User;
import mx.edu.utez.demo.model.EmpleadoModel;
import mx.edu.utez.demo.model.UsuariosModel;
import mx.edu.utez.demo.service.EmpleadoService;
import mx.edu.utez.demo.service.TiendaService;
import mx.edu.utez.demo.service.TipoEmpleadoService;
import mx.edu.utez.demo.service.UserService;
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

/**
 *
 * @author Nikcy
 */
@Controller
@RequestMapping("user")
public class UserController {

    private static final Log LOG = LogFactory.getLog(EmpleadoController.class);

    @Autowired
    private UserService UserService;

    @GetMapping("/cancel")
    public String cancel() {
        return "redirect:/user/goUser";
    }

    //@RequestMapping(value="goEmpleado",method=RequestMethod.GET)
    @GetMapping("goUser")
    public String goUsuario(Model model) {
        model.addAttribute("user", UserService.findAll());
        return "user";
    }

    @GetMapping("usuarioForm")
    public String UsuarioForm(@RequestParam(name = "id", required = false) Integer id, Model model) {
        User u = new User();
        if (id != null) {
             u = UserService.findEmpleadoByIdModel(id);

        }

        model.addAttribute("username", UserService.findAll());
        model.addAttribute("password", UserService.findAll());
        model.addAttribute("enabled", UserService.findAll());
        return "usuarioForm";
    }

    @PostMapping("/addUsuario")
    public String addUsuario(@ModelAttribute("empleadoModel") EmpleadoModel empleadoModel, RedirectAttributes model) {
        LOG.info("METHOD: addEmpleado() --PARAM : empleadoModel=" + empleadoModel);

        if (null != UserService.addEmpleado(empleadoModel)) {
            model.addFlashAttribute("result", 1);
        } else {
            model.addFlashAttribute("result", 0);
        }

        return "redirect:/Usuario/goUsuario";
    }

    @GetMapping("removUsuario")
    public String removeUsuario(@RequestParam(name = "id", required = true) int id) {
        UserService.removeUsuario(id);
        return "redirect:/empleado/goEmpleado";
    }
}
