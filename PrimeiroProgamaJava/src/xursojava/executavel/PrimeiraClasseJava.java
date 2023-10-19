package xursojava.executavel;

import java.nio.file.spi.FileSystemProvider;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	/* Main é um metodo auto executavel em java */
public static void main(String[] args) {
	
	
/* new Aluno()é uma instacia (criação de objeto)
 aluno1 é uma referencia para o objeto aluno */
	
    String nome = JOptionPane.showInputDialog("Qual é seu nome? ");/* JOptionPane entrada de dados para sair no console */
	String idade = JOptionPane.showInputDialog("Qual é sua idade");
	String dataNascimento = JOptionPane.showInputDialog("Data de nascimento ? ");
	String rg = JOptionPane.showInputDialog("Registro Geral ? ");
	String cpf = JOptionPane.showInputDialog("Qual é seu cpf ? ");
	String mae = JOptionPane.showInputDialog("Qual da mae ? ");
	String pai = JOptionPane.showInputDialog("Qual é nome do pai ? ");
	String matricula = JOptionPane.showInputDialog("Qual é a matricula ? ");
	String serie = JOptionPane.showInputDialog("Qual é serie matriculado ? ");
	String escola = JOptionPane.showInputDialog("Qual é nome da escola ? ");
	
	
	
	Aluno aluno1 = new Aluno();
    aluno1.setNome(nome);
    aluno1.setIdade(Integer.valueOf(idade));/* fazendo uma conversão pq tipo String é para texto e idade é numero*/
    aluno1.setDataNascimento(dataNascimento);
    aluno1.setRegistroGeral(rg);
    aluno1.setNumeroCpf(cpf);
    aluno1.setNomeMae(mae);
    aluno1.setNomePai(pai);
    aluno1.setDataMatricula(matricula);
    aluno1.setSerieMatriculado(serie);
    aluno1.setNomeEscola(escola);
    /*FOR é para percorre sempre as linhas de codigos quando uma disciplina é adicionada até chegar na quantidade estipulada pelo codico que é 4*/
    for (int pos = 1; pos <= 4; pos ++) {/* int por que é numero pos quer dizer posição tipo nota 1 pos1 nota 2 pos2
    pos++ é para sempre acrescentar  mais uma materia */ 
    	String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina "+pos+"?");
    	String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina"+pos+" ?");
    	
    	Disciplina disciplina = new Disciplina();/* aqui ele ta crinado a disciplina*/
    	disciplina.setDisciplina(nomeDisciplina);/* aqui nome da disciplina que na linha 46 o usuoario que vai adicionar */
    	disciplina.setNota(Double.valueOf(notaDisciplina));/* aqui nota da disciplina que na linha 47 o usuoario que vai adicionar */
    	
    	aluno1.getDisciplinas().add(disciplina);
    }
    int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?"); /*.showConfirmDialog é para mostrar na tela se quer ou não excluir a materia */
  if(escolha == 0) { /* IF 	que dizer se for == a 0  é para remosver a disciplina */
    int continuarRemover = 0;
    int posicao = 1;
    
    while(continuarRemover == 0) {
    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3, ou 4 ?");/*aqui disciplinaRemove recebe JOptionPane.showInputDialog para sair na tela qual é a disciplina que quer excluir 1 2 3 ou 4 */
    	aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);/* aluno1 que é referencia do obejeto aluno GET é para resgatar as disciplinas no obejeto Disciplina e o remove é para remover */
    	posicao ++;
    /* Integer.valueOf(disciplinaRemover).intValue() é para inverter String para numero int inteiro e o -1 no final é pq na tabela do java se conta 0 1 2 3 não 1 2 3 4 com o menos um fica mais facil usuario entender que ele vai excluir a disciplina certa */
  continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ??");
    }
    }
    
    
   
	System.out.println(aluno1.toString());
	System.out.println("media do aluno = " + aluno1.getMediaNota());
	System.out.println("resultado = " + aluno1.getAlunoAprovado2());
    
    
   System.out.println("nome é = " + aluno1.getNome());
    System.out.println("idade é "+ aluno1.getIdade());
    System.out.println("nascimento é ? "+ aluno1.getDataNascimento());
    System.out.println("registro geral : "+ aluno1.getRegistroGeral());
    System.out.println("cpf: " + aluno1.getNumeroCpf());
    System.out.println("nome da mãe? "+ aluno1.getNomeMae());
    System.out.println("nome do pai ? " + aluno1.getNomePai());
    System.out.println("serie matriculado? " + aluno1.getSerieMatriculado());
    System.out.println("data da madricula " + aluno1.getDataMatricula()) ;
    System.out.println("media da nota é ? " + aluno1.getMediaNota());
    System.out.println("Resultado "+( aluno1.getAlunoAprovado() ?  "Aprovado! " : "Reprovado!!!!!!!!!!!!"));
   
   
	
	Aluno aluno2 = new Aluno();
	aluno2.setNome("pedro");
	aluno2.setIdade(40);
	aluno2.setDataNascimento("10/10/2022");
	
	System.out.println("aluno 2 nome é ? "+ aluno2.getNome());
	System.out.println("aluno 2 idade " + aluno2.getIdade());
	System.out.println("aluno 2 data de nascimento " + aluno2.getDataNascimento());
	System.out.println("resultado" + aluno2.getAlunoAprovado());
	
	/*Aluno aluno3 = new Aluno();
	
	Aluno aluno4 = new Aluno();
	
	Aluno aluno5 = new Aluno();*/
	
	
  }
}
