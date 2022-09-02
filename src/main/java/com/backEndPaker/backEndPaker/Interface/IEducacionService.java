
package com.backEndPaker.backEndPaker.Interface;

import com.backEndPaker.backEndPaker.Model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    public String saveEducacion (Educacion edu);
    public String deleteEducacion (Long id);
    public Educacion findEducacion (Long id);
    //public List<Educacion> getEduPerfil(Long id);
}

