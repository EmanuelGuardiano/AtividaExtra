package praticaextra;
import java.util.Scanner;
public class PraticaExtra {
    public String[] nomesAlunos = new String[5];
    public int[] faltasAlunos = new int[5];
    public double[][] notasAlunos = new double[5][3];

    
        public void apresentarAlunos() {
        double somaNotasTurma = 0;
        
        System.out.println("\n===== Dados dos Alunos =====");
        for (int l = 0; l < 5; l++) {
            double somaNotasAluno = 0;
            System.out.println("Nome: " + this.nomesAlunos[l]);
            System.out.println("Faltas: " + this.faltasAlunos[l]);
            System.out.print("Notas: ");
            
            for (int c = 0; c < 3; c++) {
                System.out.print(this.notasAlunos[l][c]);
                if (c < 2) {
                    System.out.print(" | ");
                }
                somaNotasAluno += this.notasAlunos[l][c];
            }
            
            double mediaAluno = somaNotasAluno / 3;
            somaNotasTurma += mediaAluno;
            System.out.println("\nMédia: " + mediaAluno);
            System.out.println("____________________");
        }
        
        double mediaTurma = somaNotasTurma / 5;
        System.out.println("Media da Turma: " + mediaTurma);
    }
    public static void main(String[] args) {
        PraticaExtra diariotin3 = new PraticaExtra();
        Scanner scan = new Scanner(System.in);

        for (int l = 0; l < 5; l++) {
            System.out.println("Digite o Nome do Aluno:");
            diariotin3.nomesAlunos[l] = scan.nextLine();
            
            for (int c = 0; c < 3; c++) {
                System.out.println("Digite a Nota " + (c + 1) + " do Aluno:");
                diariotin3.notasAlunos[l][c] = scan.nextDouble();
            }
            
            System.out.println("Digite a Quantidade de Faltas do Aluno:");
            diariotin3.faltasAlunos[l] = scan.nextInt();
            scan.nextLine();
        }
        
        diariotin3.apresentarAlunos();
        scan.close();
    }
}
    

