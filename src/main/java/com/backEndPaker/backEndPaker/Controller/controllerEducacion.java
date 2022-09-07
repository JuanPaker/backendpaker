
package com.backEndPaker.backEndPaker.Controller;

import com.backEndPaker.backEndPaker.Interface.IEducacionService;
import com.backEndPaker.backEndPaker.Model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "https://proyectointeg-argprog.web.app")
@RestController
public class controllerEducacion {
    
    @Autowired IEducacionService ieducacionservice;
    
    @PostMapping ("/educacion/nueva")
    public String agregarEducacion (@RequestBody Educacion edu){
        ieducacionservice.saveEducacion(edu);
        return "Educacion creada correctamente";
    }
    
    @GetMapping ("/educacion/ver")
    public List<Educacion> verEducacion (){
        return ieducacionservice.getEducacion();
    }
    
    @DeleteMapping("/educacion/eliminar/{id}")
    public String borrarEducacion(@PathVariable Long id){
        ieducacionservice.deleteEducacion(id);
        return "Educacion eliminada correctamente";
    }
    
    @CrossOrigin(origins = "https://proyectointeg-argprog.web.app")
    @GetMapping("educacion/traer/perfil")
    public Educacion eduEducacion(){
        return ieducacionservice.findEducacion((long)3);
    }
    
    @CrossOrigin(origins = "https://proyectointeg-argprog.web.app")
    @PutMapping("/educacion/editar/{id}")
    public ResponseEntity<Educacion> editarEdu (@PathVariable Long id, 
                                                  @RequestBody Educacion edu){
                
            Educacion nuevaEdu = ieducacionservice.findEducacion(id);

            //nuevaEdu.setId(edu.getId());
            nuevaEdu.setCarrera(edu.getCarrera());
            nuevaEdu.setEstablecimiento(edu.getEstablecimiento());
            nuevaEdu.setFecha_fin(edu.getFecha_fin());
            nuevaEdu.setFecha_inicio(edu.getFecha_inicio());
            nuevaEdu.setTitulo(edu.getTitulo());
            nuevaEdu.setUrl_img_establecimiento(edu.getUrl_img_establecimiento());
      
                                
        ieducacionservice.saveEducacion(edu);
        return ResponseEntity.ok(nuevaEdu);
                
    }   
}