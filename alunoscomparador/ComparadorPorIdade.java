import java.util.Comparator;

public class ComparadorPorIdade implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Integer.compare(a1.getIdade(), a2.getIdade());
    }
}