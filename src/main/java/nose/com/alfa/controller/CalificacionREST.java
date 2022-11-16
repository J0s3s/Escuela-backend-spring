package nose.com.alfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nose.com.alfa.dao.CalificacionJDBC;
import nose.com.alfa.models.CalifMat;
import nose.com.alfa.models.Calificaciones;

@RestController
@RequestMapping("/calificacion")
public class CalificacionREST {
    @Autowired
    CalificacionJDBC repo;
    @GetMapping
    public List<Calificaciones> contsultar(){
        return repo.consultar();
    }


    @GetMapping("/{id}")
    public List<CalifMat> consultarCalificaciones (@PathVariable int id){
     return repo.consultarCaf(id);
    }
    
}
