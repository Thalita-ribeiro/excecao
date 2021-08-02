package excecao;

public class Basico {
    public static void main(String[] args) {

        Aluno aluno = null;

        try {
            imprimirNomeDosAlunos(aluno);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário");
        }

        try {
            System.out.println(7 / 0);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("Fim :) ");
    }

    public static void imprimirNomeDosAlunos(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}