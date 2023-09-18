public class Linha {

    Ponto inicio;
    Ponto fim;

    public Linha(Ponto inicio, Ponto fim){
        this.inicio = inicio;
        this.fim = fim;
    }
    public Ponto getInicio(){
        return this.inicio;
    }
    public void setInicio(Ponto inicio){
        this.inicio = inicio;
    }
    public Ponto getFim(){
        return this.fim;
    }
    public void setFim(Ponto fim){
        this.fim = fim;
    }
    public double getComprimento(){
        return Math.sqrt(Math.pow(this.fim.getX() - this.inicio.getX(), 2) +
                Math.pow(this.fim.getY() - this.inicio.getY(), 2));
    }
}
