import java.util.ArrayList;

public class Aluno {
    String nome;
    String matricula;
    ArrayList<Float> notas = new ArrayList<>();

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adicionarNota(float nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota digitada é inválida!");
        }
    }

    public float calcularMedia() {
        if (notas.isEmpty())
            return 0;
        float soma = 0;
        for (float n : notas)
            soma += n;
        return soma / notas.size();
    }

    public void exibirBoletim() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + notas);
        System.out.println("Média: " + calcularMedia());
    }
}