
package com.backEndPaker.backEndPaker.Controller;


import com.backEndPaker.backEndPaker.Model.ExperLaboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.backEndPaker.backEndPaker.Interface.IExperienciaLaboralService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExperLaboral {
    
    @Autowired IExperienciaLaboralService iexperlaboralservice;
    
    @GetMapping ("/experlaboral/ver")
    public List<ExperLaboral> getExperLaboral(){
        return iexperlaboralservice.getExperLaboral();
    }
 
    @PostMapping("/experlaboral/crear")
    public String saveExperLaboral(@RequestBody ExperLaboral experiencia){
        iexperlaboralservice.saveExperLaboral(experiencia);
        return "experiencia creada correctamente";
    }
    
    @DeleteMapping("/experiencia/eliminar/{id}")
    public String deleteExperlaboraltePersona(@PathVariable Long id){
        iexperlaboralservice.deleteExperlaboral(id);
        return "Experiencia eliminada correctamente";
    }
}