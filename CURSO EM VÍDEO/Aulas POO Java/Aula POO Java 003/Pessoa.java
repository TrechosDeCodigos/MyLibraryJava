package projetopessoas;
public class Pessoa {
    // Atributos 
    private String nome;
    private int idade;
    private String genero;
    // Métodos
    public void fazerAniv(){
        this.idade ++;
    }
     // Métodos Especiais
    public String getNome(){
       return nome;
    }
    public void setNome(String nome ){
        this.nome = nome;
    }
     public int getIdade (){
       return idade;
    }
     public void setIdade (int idade){
       this.idade = idade;
     }
    public String getGenero (){
     return genero;
     }
    public void setGenero (String genero){
     this.genero = genero;
    }
    // ????
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", genero=" + genero + '}';
    }

    
   
    
}
