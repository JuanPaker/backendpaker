
package com.backEndPaker.backEndPaker.Repository;

import com.backEndPaker.backEndPaker.Model.TipoEmpleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoEmpleoRepository extends JpaRepository<TipoEmpleo, Long> {
    
}
