
package aula006;

/**
 *
 * @author debora
 */
public class Aluno extends Pessoa {
    //Atributos
    protected int matricula;

    /**
     *
     */
    protected String curso;
    //Métodos
    public  void pagarMensalidade(){
     System.out.println("Pagando mensalidade do aluno " + this.nome);
    }
    //Métodos Especiais
    public int getMatricula(){
     return matricula;
    }
    public void setMatricula(int matricula){
      this.matricula = matricula;
    }
    public String getCurso () {
     return curso;
    }
    public void setCurso (String curso){
     this.curso = curso;
    }
    
}
