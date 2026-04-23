public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int idade;
    private double notaFinal;

    public Aluno(String nome, int idade, double notaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    @Override
    public int compareTo(Aluno outro) {
        return Double.compare(this.notaFinal, outro.notaFinal);
    }

    @Override
    public String toString() {
        return nome + " - Idade: " + idade + " - Nota Final: " + notaFinal;
    }
}