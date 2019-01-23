package modelo;

public class Proveedor {
    
    private int codProve; //codigo del proveedor
    private String nomProve; //nombre del proveedor 
    private String RUCProve; //ruc del proveedor
    private String prodProve; // producto del proveedor 
    private String invProve;//inversion con el proveedor

    public int getCodProve() {
        return codProve;
    }

    public void setCodProve(int codProve) {
        this.codProve = codProve;
    }

    public String getNomProve() {
        return nomProve;
    }

    public void setNomProve(String nomProve) {
        this.nomProve = nomProve;
    }

    public String getRUCProve() {
        return RUCProve;
    }

    public void setRUCProve(String RUCProve) {
        this.RUCProve = RUCProve;
    }

    public String getProdProve() {
        return prodProve;
    }

    public void setProdProve(String prodProve) {
        this.prodProve = prodProve;
    }

    public String getInvProve() {
        return invProve;
    }

    public void setInvProve(String invProve) {
        this.invProve = invProve;
    }
    
    
}
