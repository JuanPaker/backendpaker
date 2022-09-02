package com.backEndPaker.backEndPaker.Interface;


import com.backEndPaker.backEndPaker.Model.ExperLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
    
    public List<ExperLaboral> getExperLaboral();
    public String saveExperLaboral (ExperLaboral exper);
    public String deleteExperlaboral (Long id);
    public ExperLaboral findExperlaboral (Long id);
    
}
