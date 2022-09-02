
package com.backEndPaker.backEndPaker.Service;

import com.backEndPaker.backEndPaker.Interface.ITipoEmpleoService;
import com.backEndPaker.backEndPaker.Model.TipoEmpleo;
import com.backEndPaker.backEndPaker.Repository.ITipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpTipoEmpleo implements ITipoEmpleoService {
    
        @Autowired ITipoEmpleoRepository iTipoEmpleorepository;


    @Override
    public List<TipoEmpleo> getTipoEmpleo() {
        List <TipoEmpleo> tipoEmpleo = iTipoEmpleorepository.findAll();
        return tipoEmpleo;
    }
    
     @Override
    public void saveTipoEmpleo(TipoEmpleo tipoEmpleo) {
        iTipoEmpleorepository.save(tipoEmpleo);
        }
    
}