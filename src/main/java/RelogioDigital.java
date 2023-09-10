public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital(){
        this.hora = 12;
        this.minuto = 20;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public void tick() {
        this.minuto++;

        if (this.minuto >= 60) {
            this.minuto -= 60;
            this.hora++;
        }

        if (this.hora >= 24) {
            this.hora -= 24;
        }
    }
}
