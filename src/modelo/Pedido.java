package modelo;

public class Pedido {
    
    private int codPedi;//codigo de pedido
    private String tipPed;//tipo de pedido
    private String platPed;//plato del pedido
    private String cosPedi;//costo del pedidpo

    public String getCosPedi() {
        return cosPedi;
    }

    public void setCosPedi(String cosPedi) {
        this.cosPedi = cosPedi;
    }

    public int getCodPedi() {
        return codPedi;
    }

    public void setCodPedi(int codPedi) {
        this.codPedi = codPedi;
    }

    public String getTipPed() {
        return tipPed;
    }

    public void setTipPed(String tipPed) {
        this.tipPed = tipPed;
    }

    public String getPlatPed() {
        return platPed;
    }

    public void setPlatPed(String platPed) {
        this.platPed = platPed;
    }
    
}
