package Pessoa;

public class Main {

            public static void main(String[] args) {
            Professor professor = new Professor("Vinicius", "vini13@gmail.com", "Minecraft", 70.0f, 50);
            System.out.println("Dados do Professor:\n" + professor.mostraProfessor());

            Aluno aluno = new Aluno("thalita", "thalita@gmail.com", "soufoda", 3, 101);
            System.out.println("\nDados do Aluno:\n" + aluno.mostraAluno());
        }

}
