import exercicio1.Endereco;
import exercicio1.Pessoa;
import exercicio1.Turma;
import exercicio2.Fabricante;
import exercicio2.Carro;
import exercicio2.Motor;
import exercicio3.Aluno;
import exercicio3.Professor;
import exercicio3.Disciplina;
import exercicio4.Computador;
import exercicio4.Processador;
import exercicio4.MemoriaRam;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n****Exercicio 1****\n");
        //Exercicio 1
        Endereco endereco1 = new Endereco("Rua das Acácias, 12", "Itoupava Seca","Blumenau");
        Endereco endereco2 = new Endereco("Rua Republica Argentina, 3467", "Ponta Aguda", "Blumenau");

        Pessoa pessoa1 = new Pessoa("Ruthe cecilia", endereco1);
        Pessoa pessoa2 = new Pessoa("Roberta da Silva", endereco2);

        Turma turma = new Turma(10111,"Java com POO");
        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        pessoa1.mostrarDados();
        System.out.println("---");
        pessoa2.mostrarDados();
        System.out.println("---");
        turma.exibirTurma();
        //Exercicio 2
        System.out.println("\n****Exercicio 2****\n");
        Motor motor1 = new Motor("V6", 200);
        Fabricante fabricante = new Fabricante("Ford");
        Carro carro1 = new Carro("Mustang", motor1, fabricante);

        carro1.exibirCarro();
        motor1.aumentarPotencia(50);
        carro1.exibirCarro();

        Motor motor2 = new Motor("Elétrico", 300);
        carro1.trocarMotor(motor2);
        carro1.exibirCarro();

        //Exercicio 3
        System.out.println("\n****Exercicio 3****\n");
        Disciplina disciplina = new Disciplina(101, "História da Arte", 60);
        Professor professor = new Professor("Eduardo Zigmamm", disciplina);
        Aluno aluno = new Aluno("João Pedro de Andrade", disciplina, professor);
        professor.mostrarInformacoesProfessor();
        aluno.matricularAlunoDisciplina();

        //Exercicio 4
        System.out.println("\n****Exercicio 4****\n");
        Processador p = new Processador("Intel Core i7", 3.8);
        MemoriaRam ram = new MemoriaRam(16);
        Computador comp = new Computador("Dell", p, ram);

        comp.mostrarConfiguracao();
        comp.atualizarMemoria(32);
        comp.mostrarConfiguracao();

    }
}