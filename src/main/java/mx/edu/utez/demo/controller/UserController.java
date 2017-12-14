/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.controller;


import mx.edu.utez.demo.entity.User;
import mx.edu.utez.demo.model.UsuariosModel;
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

@Controller
@RequestMapping("user")
public class UserController {

    private static final Log LOG = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/cancel")
    public String cancel() {
        return "redirect:/user/goUser";
    }

    //@RequestMapping(value="goEmpleado",method=RequestMethod.GET)
    @GetMapping("goUser")
    public String goUsuario(Model model) {
        model.addAttribute("user", userService.findAll());
        return "user";
    }
/*
    @GetMapping("usuarioForm")
    public String UsuarioForm(@RequestParam(name = "id", required = false) Integer id, Model model) {
        User usuario = new User();
        if (id != null) {
             usuario = userService.findUsuarioByIdModel(id);

        }

        model.addAttribute("username", UserService.findAll());
        model.addAttribute("password", UserService.findAll());
        model.addAttribute("enabled", UserService.findAll());
        return "usuarioForm";
    }*/

    @PostMapping("/addUsuario")
    public String addUsuario(@ModelAttribute("usuariosmodel") UsuariosModel usuariosmodel, RedirectAttributes model) {
        LOG.info("METHOD: addUsuario() --PARAM : usuariosmodel=" + usuariosmodel);

        if (null != userService.addUsuario(usuariosmodel)) {
            model.addFlashAttribute("result", 1);
        } else {
            model.addFlashAttribute("result", 0);
        }

        return "redirect:/user/goUsuario";
    }

    @GetMapping("removUsuario")
    public String removeUsuario(@RequestParam(name = "username", required = true) String username) {
        userService.removeUsuario(username);
        return "redirect:/user/goUsuario";
    }
}
