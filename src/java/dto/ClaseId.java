package dto;
// Generated 28/11/2016 09:17:57 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClaseId generated by hbm2java
 */
@Embeddable
public class ClaseId  implements java.io.Serializable {


     private int idClase;
     private int grupoCursoIdCurso;
     private int grupoIdGrupo;

    public ClaseId() {
    }

    public ClaseId(int idClase, int grupoCursoIdCurso, int grupoIdGrupo) {
       this.idClase = idClase;
       this.grupoCursoIdCurso = grupoCursoIdCurso;
       this.grupoIdGrupo = grupoIdGrupo;
    }
   


    @Column(name="idClase", nullable=false)
    public int getIdClase() {
        return this.idClase;
    }
    
    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }


    @Column(name="Grupo_Curso_id_Curso", nullable=false)
    public int getGrupoCursoIdCurso() {
        return this.grupoCursoIdCurso;
    }
    
    public void setGrupoCursoIdCurso(int grupoCursoIdCurso) {
        this.grupoCursoIdCurso = grupoCursoIdCurso;
    }


    @Column(name="Grupo_idGrupo", nullable=false)
    public int getGrupoIdGrupo() {
        return this.grupoIdGrupo;
    }
    
    public void setGrupoIdGrupo(int grupoIdGrupo) {
        this.grupoIdGrupo = grupoIdGrupo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ClaseId) ) return false;
		 ClaseId castOther = ( ClaseId ) other; 
         
		 return (this.getIdClase()==castOther.getIdClase())
 && (this.getGrupoCursoIdCurso()==castOther.getGrupoCursoIdCurso())
 && (this.getGrupoIdGrupo()==castOther.getGrupoIdGrupo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdClase();
         result = 37 * result + this.getGrupoCursoIdCurso();
         result = 37 * result + this.getGrupoIdGrupo();
         return result;
   }   


}


