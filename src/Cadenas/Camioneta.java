package Cadenas;

public class Camioneta {

    private int anio;
    private String marca;
    private String placa;

    Camioneta(String marca, String placa, int anio){
        this.marca = marca;
        this.placa = placa;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Placa: " + placa + ", Año: " + anio;
    }
}
