package nose.com.alfa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlfaController {
    @GetMapping("/hola")
    public String saludar(){
        return "Hola Backend";
    }
    

    @GetMapping("/saludar")
    public String saludar(@RequestParam String nombre){
        return "Buenas..."+nombre;
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String cadena, @RequestParam int veces){
        String out="";
        for(int i=0;i<veces;i++){
        out=out+" "+cadena;
    };
    return out;
    }
}
