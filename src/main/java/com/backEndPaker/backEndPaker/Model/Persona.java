package com.backEndPaker.backEndPaker.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //@NotNull
    //@Size(min = 1, max=50, message:"no cumple con el tamanio")
    private Long id;
    //private String usuario;
    private String nombre;
    private String apellido;
    //private String password;
    private String ocupacion;
    private String acercaDe;
    //private String fechaNac;
    //private String nacionalidad;
    private String mail;
    //private String sobreMi;
    private String urlImgBackground;
    private String urlImgPerfil;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, String acercaDe, String mail, String urlImgBackground, String urlImgPerfil, List<Educacion> userEdu, List<ExperLaboral> userExp) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.acercaDe = acercaDe;
        this.mail = mail;
        this.urlImgBackground = urlImgBackground;
        this.urlImgPerfil = urlImgPerfil;
        this.userEdu = userEdu;
        this.userExp = userExp;
    }

   

  
    
    
    
    @OneToMany (mappedBy = "persona")
    @JsonManagedReference

    private List<Educacion> userEdu;
    
    
    @OneToMany (mappedBy = "persona")
    @JsonManagedReference
    
    private List<ExperLaboral> userExp;

   // public void setUrlImgBackground(String nuevaUrlImgBackground) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
    
}
