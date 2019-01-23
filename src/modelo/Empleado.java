package modelo;

public class Empleado {
            
    private int codEmple;//codigo del empleado 
    private String nombEmple; //nombre de empleado
    private String apellPaEmple;// apellido paterno empleado 
    private String apellMaEmple;//apellido materno del empleado
    private String carEmple;//cargo desempeñado
    private String tipEmple;//tipo de empleado si es por contrato o no
    private String numEmple;// numero de empleado

    public int getCodEmple() {
        return codEmple;
    }

    public void setCodEmple(int codEmple) {
        this.codEmple = codEmple;
    }

    public String getNombEmple() {
        return nombEmple;
    }

    public void setNombEmple(String nombEmple) {
        this.nombEmple = nombEmple;
    }

    public String getApellPaEmple() {
        return apellPaEmple;
    }

    public void setApellPaEmple(String apellPaEmple) {
        this.apellPaEmple = apellPaEmple;
    }

    public String getApellMaEmple() {
        return apellMaEmple;
    }

    public void setApellMaEmple(String apellMaEmple) {
        this.apellMaEmple = apellMaEmple;
    }

    public String getCarEmple() {
        return carEmple;
    }

    public void setCarEmple(String carEmple) {
        this.carEmple = carEmple;
    }

    public String getTipEmple() {
        return tipEmple;
    }

    public void setTipEmple(String tipEmple) {
        this.tipEmple = tipEmple;
    }

    public String getNumEmple() {
        return numEmple;
    }

    public void setNumEmple(String numEmple) {
        this.numEmple = numEmple;
    }
    
}
