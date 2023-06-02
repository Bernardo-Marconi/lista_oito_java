public class MetodosRetangulo {

    private Double baseRetangulo, alturaRetangulo;
    private final double piso = 0.36;
    private double area;

    public void setBaseRetangulo(Double baseRetangulo) {
        this.baseRetangulo = baseRetangulo;
    }

    public void setAlturaRetangulo(Double alturaRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
    }

    public Double getAlturaRetangulo() {
        return alturaRetangulo;
    }

    public Double getBaseRetangulo() {
        return baseRetangulo;
    }

    public Double calcularAreaRetangulo() {
        Double resultadoAreaRetangulo = ((baseRetangulo * alturaRetangulo) / 100) / 100;
        return resultadoAreaRetangulo;
    }

    public Double calcularPerimetroRetangulo() {
        Double resultadoPerimetroRetangulo = ((baseRetangulo * 2) + (alturaRetangulo * 2)) / 100;
        return resultadoPerimetroRetangulo;
    }

    public void setareaRetangulo(Double area) {
        this.area = area;
    }

    public Double calcularQuantidadePiso() {
        Double QuantidadePiso = area / piso;
        return QuantidadePiso;
    }
}
