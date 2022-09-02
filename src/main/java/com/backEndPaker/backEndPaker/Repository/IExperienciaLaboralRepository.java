package com.backEndPaker.backEndPaker.Repository;

import com.backEndPaker.backEndPaker.Model.ExperLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaLaboralRepository extends JpaRepository<ExperLaboral,Long> {
}
    

