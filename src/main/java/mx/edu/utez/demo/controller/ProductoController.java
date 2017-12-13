
package mx.edu.utez.demo.controller;
import mx.edu.utez.demo.model.ProductoModel;
import mx.edu.utez.demo.service.ProductoService;
import mx.edu.utez.demo.service.TiendaService;
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
@RequestMapping("producto")
public class ProductoController {
    private static final Log LOG = LogFactory.getLog(ProductoController.class);
    @Autowired
    private ProductoService productoService;
    @Autowired
    private TiendaService tiendaService;
    
    @GetMapping("/cancel")
    public String cancel() {
        return "redirect:/producto/goProducto";
    }
    @GetMapping("goProducto")
    public String goProducto(Model model) {
        model.addAttribute("producto", productoService.findAll());
        return "producto";
    }
    @GetMapping("productoForm")
    public String productoForm(@RequestParam(name = "id", required = false) Integer id, Model model) {
        ProductoModel productoModel = new ProductoModel();
        if (id != null) {
            productoModel = productoService.findProductoByIdModel(id);

        }
        model.addAttribute("productoModel", productoModel);
        model.addAttribute("listaTienda", tiendaService.findAll());
        return "productoForm";
    }
    
    @PostMapping("/addproducto")
    public String addroducto(@ModelAttribute("productoModel") ProductoModel productoModel, RedirectAttributes model) {

        if (null != productoService.addProducto(productoModel)) {
            model.addFlashAttribute("result", 1);
        } else {
            model.addFlashAttribute("result", 0);
        }

        return "redirect:/producto/goProducto";
    }
    @GetMapping("removeproducto")
	public String removeProducto(@RequestParam(name="id",required=true)int id){
		productoService.removeProducto(id);
		return "redirect:/producto/goProducto";
	}
    
}
