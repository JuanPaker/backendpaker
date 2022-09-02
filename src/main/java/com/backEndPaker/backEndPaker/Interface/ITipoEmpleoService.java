package com.backEndPaker.backEndPaker.Interface;

import com.backEndPaker.backEndPaker.Model.TipoEmpleo;
import java.util.List;


public interface ITipoEmpleoService {
    
        public List<TipoEmpleo> getTipoEmpleo();
        public void saveTipoEmpleo(TipoEmpleo tipoEmpleo);
 
    
}
