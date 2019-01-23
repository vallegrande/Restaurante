package modelo;

public class Operacion {
    private int codOper;//codigo de la operacion que se realizara
    private String tipOper;//tipo de operacion que realizara 
    private String nomUser;//nombre del usuario
    private String fechOper;//fecha de la operacion

    public int getCodOper() {
        return codOper;
    }

    public void setCodOper(int codOper) {
        this.codOper = codOper;
    }

    public String getTipOper() {
        return tipOper;
    }

    public void setTipOper(String tipOper) {
        this.tipOper = tipOper;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getFechOper() {
        return fechOper;
    }

    public void setFechOper(String fechOper) {
        this.fechOper = fechOper;
    }
    
}
