package com.backEndPaker.backEndPaker.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class ExperLaboral {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private Long id;
    private String establecimiento;
    private String puesto;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion;
    private int trabajo_actual;
    private String url_img_empresa;
    
    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonBackReference   
    private Persona persona;
    
   // @ManyToOne
   // private TipoEmpleo tipoEmpleo;
    
}

