package nose.com.alfa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nose.com.alfa.dao.AlumnoJDBC;
import nose.com.alfa.models.Alumnos;

@RestController
@RequestMapping("/alumnos")
public class AlumnoREST {
    @Autowired
    AlumnoJDBC repo;
    @GetMapping
    public List<Alumnos> obtAlumnos(){
        return repo.consultarAlumnos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarAlumnos(@PathVariable int id){
        try {
            Alumnos respuesta= repo.buscar(id);
            return new ResponseEntity<Alumnos>(respuesta, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
    }    
    @DeleteMapping("/{id}")
    public void desactivarAlumno(@PathVariable int id){
        
       repo.desactivar(id);
    }
    @PutMapping
    public ResponseEntity<?> actualizarAlumno(@RequestBody Alumnos alumno){
        try {
            repo.actualizar(alumno);
            return new ResponseEntity<Void>( HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
    @PostMapping
    public ResponseEntity<?> insertarAlumno(@RequestBody Alumnos alumno){
        try {
            repo.insertar(alumno);
            return new ResponseEntity<Void>( HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
    
   /*  @GetMapping
    public List<Alumno> obtenerAlumnos(){
        List<Alumno> resultado= new ArrayList<Alumno>();
        Alumno a1= new Alumno();
        a1.setId((byte)1);
        a1.setNombre("Fer Barajas");
        a1.setNocontrol("19640203");
        resultado.add(a1);
        Alumno a2= new Alumno();
        a2.setId((byte)2);
        a2.setNombre("Dulce Fatima Garcia Basulto");
        a2.setNocontrol("19640212");
        resultado.add(a2);
        return resultado;
    }
    */
}