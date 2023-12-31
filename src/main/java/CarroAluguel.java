public class CarroAluguel {
    private float valorPorKm;
    private float distanciaPercorrida;
    private boolean disponivel;
    private boolean sinistro;

    public CarroAluguel(float valorPorKm){
        this.valorPorKm = valorPorKm;
        this.distanciaPercorrida = 0;
        this.disponivel = true;
    }
    public float getValorPorKm(){
        return this.valorPorKm;
    }

    public void setValorPorKm(float valorPorKm){
        this.valorPorKm = valorPorKm;
    }

    public float getDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida(float distanciaPercorrida){
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void alugar() throws CarroIndisponivelException {
        if(!isDisponivel()) {
            throw new CarroIndisponivelException();
        }

        this.disponivel = false;
    }

    public void devolver() throws CarroDisponivelException, CarroNaoPagoException  {
        if(isDisponivel()){
            throw new CarroDisponivelException();
        } else if(getDebito() != 0){
            throw new CarroNaoPagoException();
        }

        this.sinistro = false;
        this.distanciaPercorrida = 0;
        this.disponivel = true;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public boolean hasSinistro(){
        return this.sinistro;
    }

    public void setSinistro(boolean sinistro){
        this.sinistro = sinistro;
    }

    public float getDebito() {
        float valor = valorPorKm * distanciaPercorrida;
        if(hasSinistro()){
            return valor + 0.6f * valor;
        }

        return valor;
    }

    public void pagar() throws CarroDisponivelException {
        if(isDisponivel()) {
            throw new CarroDisponivelException();
        }

        this.distanciaPercorrida = 0;
    }
}

class CarroDisponivelException extends Exception {
    public CarroDisponivelException() {
        super("O carro está disponível.");
    }
}
class CarroIndisponivelException extends Exception{
    public CarroIndisponivelException() {
        super("O carro está indisponível.");
    }

}
class CarroNaoPagoException extends Exception{
    public CarroNaoPagoException() {
        super("O carro não foi pago.");
    }
}
