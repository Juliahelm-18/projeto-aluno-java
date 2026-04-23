import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Mariana", 17, 8.5));
        alunos.add(new Aluno("Carlos", 16, 6.2));
        alunos.add(new Aluno("Ana", 18, 9.1));
        alunos.add(new Aluno("Bruno", 17, 7.4));
        alunos.add(new Aluno("Fernanda", 16, 8.0));
        alunos.add(new Aluno("Diego", 18, 5.5));
        alunos.add(new Aluno("Elisa", 17, 9.8));
        alunos.add(new Aluno("Gabriel", 16, 7.0));
        alunos.add(new Aluno("Helena", 18, 6.8));
        alunos.add(new Aluno("Igor", 17, 8.3));

        System.out.println("Lista original:");
        for (Aluno a : alunos) {
            System.out.println(a);
        }

        System.out.println();

        ArrayList<Aluno> porNota = new ArrayList<>(alunos);
        Collections.sort(porNota);
        System.out.println("Ordenado por nota final (crescente):");
        for (Aluno a : porNota) {
            System.out.println(a);
        }

        System.out.println();

        ArrayList<Aluno> porNome = new ArrayList<>(alunos);
        ComparadorPorNome comparadorNome = new ComparadorPorNome();
        porNome.sort(comparadorNome);
        System.out.println("Ordenado por nome (alfabetica):");
        for (Aluno a : porNome) {
            System.out.println(a);
        }

        System.out.println();

        ArrayList<Aluno> porIdade = new ArrayList<>(alunos);
        ComparadorPorIdade comparadorIdade = new ComparadorPorIdade();
        porIdade.sort(comparadorIdade);
        System.out.println("Ordenado por idade (crescente):");
        for (Aluno a : porIdade) {
            System.out.println(a);
        }
    }
}