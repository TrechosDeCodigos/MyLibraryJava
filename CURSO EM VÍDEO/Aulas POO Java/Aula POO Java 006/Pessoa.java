
package aula006;
public abstract class Pessoa {
   protected String nome;
   protected int idade;
   protected String genero;
   //Métodos
   public void fazerAniversario(){
        this.idade ++;
   }
   //Métodos Especiais
   public String getNome() {
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public int getIdade() {
     return idade;
   }
   public void setIdade (int idade){
     this.idade = idade;
   }
   public String getGenero(){
     return genero;
   }
   public void setGenero(String genero){
     this.genero = genero;
   }
    // toString
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", genero=" + genero + '}';
    }
   
   
}
