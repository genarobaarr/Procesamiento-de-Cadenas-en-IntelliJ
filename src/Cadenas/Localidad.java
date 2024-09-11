package Cadenas;

public class Localidad {

    private String cp;
    private String estado;
    private String municipio;

    Localidad(String cp, String municipio, String  estado){
        this.cp = cp;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Código Postal: " + cp + ", Municipio: " + municipio + ", Estado: " + estado;
    }
}
