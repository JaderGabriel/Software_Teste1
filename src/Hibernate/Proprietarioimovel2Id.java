package Hibernate;
// Generated 02/07/2013 03:06:14 by Hibernate Tools 3.6.0



/**
 * Proprietarioimovel2Id generated by hbm2java
 */
public class Proprietarioimovel2Id  implements java.io.Serializable {


     private int idProprietario;
     private String matricula;

    public Proprietarioimovel2Id() {
    }

    public Proprietarioimovel2Id(int idProprietario, String matricula) {
       this.idProprietario = idProprietario;
       this.matricula = matricula;
    }
   
    public int getIdProprietario() {
        return this.idProprietario;
    }
    
    public void setIdProprietario(int idProprietario) {
        this.idProprietario = idProprietario;
    }
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }




}

