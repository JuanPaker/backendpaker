package com.backEndPaker.backEndPaker.Controller;

import com.backEndPaker.backEndPaker.Interface.ITipoEmpleoService;
import com.backEndPaker.backEndPaker.Model.TipoEmpleo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerTipoEmpleo {
    
        @Autowired ITipoEmpleoService iTipoEmpleoService;

    @GetMapping("/tipoEmpleo/traer")
    public List<TipoEmpleo> getTipoEmpleo(){
        return iTipoEmpleoService.getTipoEmpleo();
    }
    
    @PostMapping("/tipoEmpleo/crear")
    public String createTipoEmpleo(@RequestBody TipoEmpleo tipoEmpleo){
        iTipoEmpleoService.saveTipoEmpleo(tipoEmpleo);
        return "Tipo creado correctamente";
    }
}
