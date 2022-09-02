
package com.backEndPaker.backEndPaker.Repository;

import com.backEndPaker.backEndPaker.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Long>{

    
}
