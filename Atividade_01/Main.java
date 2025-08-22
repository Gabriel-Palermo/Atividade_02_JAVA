public class Main {
    public static void main(String[] args) {

        System.out.println("------- Aluno -------");
        Aluno aluno = new Aluno("Gabriel", "01aluno2025");
        aluno.adicionarNota(7.5f);
        aluno.adicionarNota(9.1f);
        aluno.exibirBoletim();
    }
}