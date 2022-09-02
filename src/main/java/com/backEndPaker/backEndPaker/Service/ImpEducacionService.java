
package com.backEndPaker.backEndPaker.Service;

import com.backEndPaker.backEndPaker.Interface.IEducacionService;
import com.backEndPaker.backEndPaker.Model.Educacion;
import com.backEndPaker.backEndPaker.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService {

    @Autowired IEducacionRepository eduRepo;
            
            
    @Override
    public List<Educacion> getEducacion() {
    return eduRepo.findAll();
    }
    /*
    @Override
    public List<Educacion> getEduPerfil(Long id){
        return eduRepo.findById(id).orElse(null);
    }*/

    @Override
    public String saveEducacion(Educacion edu) {
        eduRepo.save(edu);
       return "Educacion creada correctamente";
    }

    @Override
    public String deleteEducacion(Long id) {
        eduRepo.deleteById(id);
        return "Educacion eliminada";
    }

    @Override
    public Educacion findEducacion(Long id) {
        return eduRepo.findById(id).orElse(null) ;

    }
    
}
