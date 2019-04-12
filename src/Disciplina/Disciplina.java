
package Disciplina;
import Professor.professor;
import Aluno.aluno;

public class Disciplina {
private String nome;
private int semestre;
private aluno alunos[];
private professor Professor1;
private int quantidade;


public Disciplina(){
nome = "Desconhecido";
professor y = new professor();
aluno x [] = new aluno[35]; 
quantidade =0;}

public void atualizar_professor(professor x){
Professor1 = x;}

public void adicionar_aluno(aluno y){
   
   quantidade++;
   if(quantidade == 35){
   System.out.println("Erro não posso adicionar");}
}

public void imprimir(){

}}

