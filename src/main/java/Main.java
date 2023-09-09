public class Main {

    public static void main(String[] args) {
       Estudante e1 = new Estudante();
        Estudante e2 = new Estudante();
        e1.setNome("RAyanne");
        e1.setMatricula(254848);
        e2.setNome("Ramon");
        e2.setMatricula(787758);

        System.out.println("br.edu.ifpb.lab1.Estudante 1: " + e1.getNome() + " - " + e1.getMatricula());
        System.out.println("br.edu.ifpb.lab1.Estudante 2: " + e2.getNome() + " - " + e2.getMatricula());
    }
}