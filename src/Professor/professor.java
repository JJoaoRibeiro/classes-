
package Professor;


public class professor {
    private String nome,matricula,sexo;
    private int idade;
    
    
    public professor(){
    nome = "Desconhecido";
    sexo = "indefinido";
    matricula = "000";}
    
    public professor(String nome,String matricula,String sexo,int idade){
    this.nome = nome;
    this.matricula = matricula;
    this.sexo = sexo;
    this.idade = idade;}
    
    public void setnome(String h){
    nome = h;}
    public String getnome(){
    return nome;}
    
    public void setmatricula(String y){
    matricula= y;}
    public String getmatricula(){
    return matricula;}
    
    public void setsexo(String t){
    sexo = t;}
    public String getsexo(){
    return sexo;}
    
    public void setidade(int t){
    idade = t;}
    public int getidade(){
    return idade;}
    
    
 
    
}
