package modelo;

public class Mesa {
    private int codMesa;
    private String numMesa;
    private String capMesa;
    private String estMesa; //estado de la mesa (disponible o no)

    public String getEstMesa() {
        return estMesa;
    }

    public void setEstMesa(String estMesa) {
        this.estMesa = estMesa;
    }
    

    public int getCodMesa() {
        return codMesa;
    }

    
    public void setCodMesa(int codMesa) {
        this.codMesa = codMesa;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public String getCapMesa() {
        return capMesa;
    }

    public void setCapMesa(String capMesa) {
        this.capMesa = capMesa;
    }
    
    
}
