
package Aluno;

public class aluno {
private String nome, matricula,curso,sexo;
private int semestre,idade;
 
public aluno(){
nome = "Desconhecido";
curso = "Desconhecido";
matricula ="000";
}

public aluno(String nome,String matricula,String curso,String sexo,int semestre,int idade){
this.nome = nome;
this.matricula =matricula;
this.curso=curso;
this.sexo=sexo;
this.semestre = semestre;
this.idade = idade;
}

public void setnome(String y){
nome = y;}
public String getnome(){
return nome;}

public void setmatricula(String r){
matricula = r;}
public String getmatricula(){
return matricula;}

public void setcurso(String i){
curso = i;}
public String getcurso(){
return curso;}

public void setsexo(String d){
sexo = d;}
public String getsexo(){
return sexo;}

public void setsemestre(int g){
semestre = g;}
public int getsemestre(){
return semestre;}

public void setidade(int w){
idade = w;}
public int getidade(){
return idade;}






}
