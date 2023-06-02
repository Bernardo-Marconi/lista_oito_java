public class MetodosQuadrado {
    
    private float ladoQuadrado;

    public void setLadoQuadrado(float ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public float getLadoQuadrado() {
        return ladoQuadrado;
    }

    public float calcularAreaQuadrado() {
        float resultadoAreaQuadrado = (ladoQuadrado * ladoQuadrado);
        return resultadoAreaQuadrado;
    }
}
