public class Circulo {

    private static final float PI = 3.14159f;

    private float raio;
    private float area;
    float circunferencia;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea() {
        return (float) (PI * Math.pow(raio, 2));
    }

    public float getCircunferencia() {
        return 2 * PI * raio;
    }
}
