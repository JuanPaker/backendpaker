package com.backEndPaker.backEndPaker.Service;

import com.backEndPaker.backEndPaker.Interface.IExperienciaLaboralService;
import com.backEndPaker.backEndPaker.Model.ExperLaboral;
import com.backEndPaker.backEndPaker.Repository.IExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired IExperienciaLaboralRepository experRepo;
            
    @Override
    public List<ExperLaboral> getExperLaboral() {
        return experRepo.findAll();
    }

    @Override
    public String saveExperLaboral (ExperLaboral exper) {
        experRepo.save(exper);
        return "experiencia creada correctamente";
    }

    @Override
    public String deleteExperlaboral (Long id) {
        return "Experiencia eliminada correctamente";
    }

    @Override
    public ExperLaboral findExperlaboral (Long id) {
        return experRepo.findById(id).orElse(null);
    }

}
