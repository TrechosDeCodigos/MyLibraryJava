
package projetopessoas;
public class Aluno extends Pessoa {
   // Atributos 
    private int matricula;
    private String curso;
    // Métodos
    public void cancelMatric(){
       System.out.println (" Matrícula será cancelada");
        
    }
     // Métodos Especiais
    public int getMatric(){
       return matricula;
    }
    public void setMatric(int matricula ){
        this.matricula = matricula;
    }
     public String getCurso (){
       return curso;
    }
     public void setCurso (String curso){
       this.curso = curso;
     } 
}
