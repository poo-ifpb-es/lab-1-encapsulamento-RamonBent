public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;
    private float SalarioAnual;
    public Funcionario (String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public float getSalarioAnual(){
        return SalarioAnual = (salario* 12);
    }
    public void concederAumento(float valor){
        //if (valor >= 0 && valor <= 100){
            this.salario = salario*(valor/100+1);
        //}
    }
}
