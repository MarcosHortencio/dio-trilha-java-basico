
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> alunos = Arrays.asList("Camila", "João", "Lucas", "Bruna", "Pedro", "Maria");

        Map<String, Integer> alunosENotas = pedirNotasDosAlunos(alunos, scan);
        System.out.println(alunosENotas);
        int media = calculaMediaDaTurma(alunos, scan);

    }

    private static double calcularMediaDaTurma(Map<String, Integer> alunosESuasNotas) {

        return alunosESuasNotas.values().stream()
                .mapToDouble(m -> m.doubleValue())
                .average()
                .orElse(0);

    }

    private static void mostraAClassificacaoDosAlunos(Map<String, Integer> alunosESuasNotas) {
        Set<Map.Entry<String, Integer>> entries = alunosESuasNotas.entrySet();

        List<String> aprovados = new ArrayList<>();
        List<String> reprovados = new ArrayList<>();
        List<String> recuperacao = new ArrayList<>();

        entries.forEach(alunoENota -> {
            if (alunoENota.getValue() > 7) aprovados.add(alunoENota.getKey());
            else if (alunoENota.getValue() < 5) reprovados.add(alunoENota.getKey());
            else recuperacao.add(alunoENota.getKey());
        });

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.printf("Média da turma %d", media);
    }

    public static int calculaMediaDaTurma(List<String> listaDeAlunos, Scanner scan) {

    private static Map<String, Integer> pedirNotasDosAlunos(List<String> alunos, Scanner scan) {
        Map<String, Integer> alunosEnotas = new TreeMap<>();

       /*for (String aluno : alunos) {
            System.out.printf("Média do aluno %s: ", aluno);
            alunosEnotas.put(aluno, scan.nextInt());
        int somaDasNotas = 0;
        for (String aluno : listaDeAlunos) {
            System.out.printf("Nota do aluno(a) %s", aluno);
            somaDasNotas += scan.nextInt();
        }

        return alunosEnotas;*/
        return somaDasNotas / listaDeAlunos.toArray().length;

       // Map<String, Integer> alunosEnotas = new TreeMap<>();

        alunos.forEach(aluno -> {
            System.out.printf("Média do aluno %s: ", aluno);
            alunosEnotas.put(aluno.toString(), scan.nextInt());
        });

        return alunosEnotas;
    }


}